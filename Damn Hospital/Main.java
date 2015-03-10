import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Patient patient1 = new Patient(95, 30, false, "Болит горло", "Стив");
        Patient patient2 = new Patient(60, 25, false, "Болят глаза", "Джейсон");
        Doctor doctor = new Doctor(25, new String[]{"Болит горло", "Болят глаза"}, 15 );

        Hospital hospital = new Hospital();

        hospital.receiveDoctor(doctor);
        hospital.receivePatient(patient1);
        hospital.receivePatient(patient2);
        hospital.heal();
        hospital.release();
        }
    }







