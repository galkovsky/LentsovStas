public class Doctor extends Human {
    private int skill;
    private String[] diagnosis;
    private int cost;
    private int patientCount;
    private Patient[] patients = new Patient[5];

    public Doctor(int skill, String[] diagnosis, int cost) {
        this.skill = skill;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }

    public void heal(){
        for (int i = 0; i < patientCount; i++) {
            int min = Math.min(skill, patients[i].getMoney());
            patients[i].increase(min);
            System.out.println("Пациент " + patients[i].name + " стал здоровее на " + min + " значение и теперь он здоров на " + patients[i].getHealth() + "%" );
            System.out.println("Баланс пациента был: " + patients[i].getMoney() + " $");
            patients[i].setMoney(patients[i].getMoney()- min);
            System.out.println("Пациент заплатил " + min + " $");
            System.out.println("Баланс пациента стал: " + patients[i].getMoney() + " $");
        }

    }

    public boolean ifCanHeal(Patient patient){
        if (patientCount == patients.length) {
            System.out.println("Я не могу лечить этого пациента");
            return false;
        }
        for(int i = 0; i < diagnosis.length; i++){
            if (diagnosis[i].equalsIgnoreCase(patient.getDiagnosis())){
                System.out.println("Я могу лечить этого пациента");
                return true;
            }
        }
        System.out.println("Я не могу лечить этого пациента");
        return false;
    }
    public void addPatient(Patient patient){
        patients[patientCount] = patient;
        patientCount++;
        System.out.println("Пациент добавлен к доктору");
    }

    public void release () {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getHealth() >= 100) {
                System.out.println("Пациент " + patients[i].name + " вылечен и выписан от доктора");
                int n = 0;
                while (i < (patientCount-1)) { // отнимаю один, чтобы цикл не выполнялся  на последнем объекте массива
                    patients[i] = patients[i+1];//так как будет пытаться найти объект "последний +1", которого нет.
                    i++;
                    n++;
                }
                patientCount --;
                i = i-n;
            }
        }
    }


}
