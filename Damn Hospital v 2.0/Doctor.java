//package com.company;

public class Doctor extends Human implements Healer {
    private int skill;
    private String[] diagnosis;
    private String diagnosisToHeal;
    private int cost;
    private int patientCount;
    private Ailing[] patients = new Patient[2];
    private int health;


    public Doctor(String name, int skill, String[] diagnosis, int cost) {
        this.name=name;
        this.skill = skill;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }

    @Override
    public void heal(){
        for (int i = 0; i < patientCount; i++) {
            int min = Math.min(skill, patients[i].getMoney());
            patients[i].increase(min, cost);
            System.out.println("Пациент "+patients[i].getName()+" стал здоровее " + min + " значение, а беднее - "+cost);
        }

    }

    @Override
    public boolean ifCanHeal(Ailing patient){
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

    @Override
    public void addPatient(Ailing patient){
        patients[patientCount] = patient;
        patientCount++;
        System.out.println("Пациент добавлен к доктору");
    }

    @Override
    public Ailing[] relese(){
        Ailing[] toRelease = new Ailing[10];
        for (int i = 0, relIndex = 0; i < patientCount; i++) {
            if (patients[i].relesedoctor()) {
                toRelease[relIndex] = patients[i];
                relIndex++;
                for (int j = i; j <patientCount-1; j++) {
                    patients[i]=patients[i+1];
                }
                patientCount--;
                System.out.println("У доктора " + name + " выписался пациент "+ patients[i].getName());

                i=i-1;

            };
        }
        return toRelease;

    }

    public  String toString() {


        for (int i = 0; i <patientCount ; i++) {
            System.out.println(patients[i]);

        }
        return  "У доктора "+name + " " + patientCount + " пациентов";

    }

    @Override
    public boolean increase(int health, int cost) {
        return false;
    }

    @Override
    public boolean relesedoctor(){
        if (health>=100) {
            System.out.println("Пациент"+name+"выписался");
            return true;
        }
        else return false;
    }

    @Override
    public boolean relesehospital() {
        if (health >= 100) {
            return true;
        }
        return false;
    }

    @Override
    public int getMoney() {
        return 0;
    }

    @Override
    public String getDiagnosis() {
        return diagnosisToHeal;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public boolean isInsurance() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

}

