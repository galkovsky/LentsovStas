public class Hospital {
    private int patientCount;
    private int doctorCount;
    private Patient[] patients = new Patient[5];
    private Doctor[] doctors = new Doctor[3];

    public  boolean receivePatient(Patient newPatient){
        if (newPatient.getMoney() <= 0 && !newPatient.isInsurance()){
            return false;
        }
        if (patientCount == patients.length){
            return false;
        }
        if (newPatient.getHealth() >= 100 ) {
            return false;
        }
        int foundDoctorIndex = -1;
        for(int i = 0; i < doctorCount; i++){
            if (doctors[i].ifCanHeal(newPatient)){
                foundDoctorIndex = i;
            }
        }
        if (foundDoctorIndex == -1){
            return false;
        }
        doctors[foundDoctorIndex].addPatient(newPatient);
        System.out.println("Пациент лег в больницу");
        patients[patientCount]= newPatient;
        patientCount ++;
        return true;

    }
    public boolean receiveDoctor(Doctor doctor){
        if(doctorCount == doctors.length){
            return false;
        }
        doctors[doctorCount] = doctor;
        doctorCount++;
        System.out.println("Доктор пришел в больницу");
        return true;
    }
    public void heal(){
        for (int i = 0; i <doctorCount ; i++) {
        doctors[i].heal();
        }
    }

    public void release () {

        System.out.println("Пациентов в госпитале было " + patientCount);

        for (int i = 0; i <doctorCount; i++) {
            doctors[i].release();
        }
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getHealth() >= 100) {
                System.out.println("Пациент " + patients[i].name + " вылечен и выписан из больницы");
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

        System.out.println("Пациентов в госпитале стало " + patientCount);
    }

}
