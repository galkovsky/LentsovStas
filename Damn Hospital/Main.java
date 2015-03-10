import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

       boolean endCycle = false;

        while (!endCycle) {

            System.out.println("Нажмите 1 – для введения докторов");
            System.out.println("Нажмите 2 – для введения пациентов");
            System.out.println("Нажмите 3 – для лечения пациентов");
            System.out.println("Нажмите 0 – \"Остановите это наконец-то\"");

            Scanner scanner = new Scanner (System.in);
            int userChoice = scanner.nextInt();

            switch (userChoice) {

                case 2:

                    Patient patient1 = new Patient(95, 30, false, "Болит горло", "Стив");// хотелось ввести через сканер, но как же хочется спать
                    Patient patient2 = new Patient(60, 25, false, "Болят глаза", "Джейсон");

                    hospital.receivePatient(patient1);
                    hospital.receivePatient(patient2);

                    break;

                case 1:

                    Doctor doctor = new Doctor(25, new String[]{"Болит горло", "Болят глаза"}, 15);
                    hospital.receiveDoctor(doctor);
                    break;

                case 3:
                    hospital.heal();
                    hospital.release();
                    break;

                case 0:
                    endCycle = true;
                    System.out.println("Хуууух, закончилось...");
            }
        }
    }

}







