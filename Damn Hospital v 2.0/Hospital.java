//package com.company;

public class Hospital {
    private int patientCount;
    private int doctorCount;
    private Ailing[] patients = new Patient[5];
    private Healer[] doctors = new Healer[3];

    public void doctorAsPatient (Healer doctor){
        receivePatient(doctor);
    }

    public  boolean receivePatient(Ailing newPatient){
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
        patients[patientCount]=newPatient;
        patientCount++;
        System.out.println("Пациент"+newPatient.getName()+" лег в больницу");
        return true;
    }
    public boolean receiveDoctor(Doctor doctor){
        if(doctorCount == doctors.length){
            return false;
        }
        doctors[doctorCount] = doctor;
        doctorCount++;
        System.out.println("Доктор "+doctor.name+" устроился в больницу");
        return true;
    }
    public void heal(){
        for (int i = 0; i <doctorCount ; i++) {
        doctors[i].heal();
        }
    }
    public void  relese(){
        for (int i = 0; i <doctorCount ; i++) {
            doctors[i].relese();
        }
        for (int i = 0; i <patientCount ; i++) {
            if (patients[i].relesehospital()) {
                for (int j = i; j <patientCount-1; j++) {
                    patients[i]=patients[i+1];
                }
                patientCount--;
                System.out.println("Из госпиталя выписался пациент "+ patients[i].getName());
                i=i-1;
            }
        }


    }

    public String toString() {
        for (int i = 0; i <doctorCount ; i++) {
            System.out.println(doctors[i]);
            System.out.println("////////////////////////////////////////////");

        }
        return "Такая ситуация в больнице на сейчас";

    }

}
