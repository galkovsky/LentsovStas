//package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        boolean t = true;
        while (t)  {


            System.out.println("Выберите один из вариантов:");
            System.out.println("0 - выход;");
            System.out.println("1 - добавить доктора;");
            System.out.println("2 - добавить пациента;");
            System.out.println("3 - лечить;");
            System.out.println("4 - выписать.");

            Scanner scan = new Scanner(System.in);
            int dejstvie;
            if (scan.hasNextInt()) {
                dejstvie = scan.nextInt();
            } else {
                System.out.println("Неправильный выбор");
                continue;
                }
            if (dejstvie >= 0 && dejstvie <= 4) {
                switch (dejstvie) {
                    case 0: {
                        t =false;
                        break;
                    }
                    case 1: {

                        System.out.println("Введите имя доктора");
                        String name = scan.next();
                        System.out.println("Введите skill доктора");
                        int skill = scan.nextInt();
                        System.out.println("Введите cost доктора");
                        int cost = scan.nextInt();
                        System.out.println("Введите количество диагнозов, которые лечит доктор");
                        String[] diagnosis = new String[scan.nextInt()];
                        for (int i = 0; i < diagnosis.length; i++) {
                            System.out.println("Введите диагноз,который лечит данный доктор: FLUE, LUPUS, COLD, MEASLES");
                            Diagnoses diagnos = Diagnoses.valueOf(scan.next().toUpperCase());
                            diagnosis[i] = diagnos.name();
                        }
                        if (!hospital.receiveDoctor(new Doctor(name, skill, diagnosis, cost))) {
                            System.out.println("Новый доктор не влезает в больницу");
                        }
                        System.out.println(hospital);
                        break;
                    }
                    case 2: {
                        System.out.println("Введите имя пациента");
                        String name = scan.next();
                        System.out.println("Введите health пациента");
                        int health = scan.nextInt();
                        System.out.println("Введите money пациента");
                        int money = scan.nextInt();
                        System.out.println("Введите наличие insurance (true/false)");
                        boolean insurance = scan.nextBoolean();
                        System.out.println("Введите диагноз пациента: FLUE, LUPUS, COLD, MEASLES");
                        Diagnoses diagnosPatient = Diagnoses.valueOf(scan.next().toUpperCase());

                        if (!hospital.receivePatient(new Patient(name, health, money, insurance, diagnosPatient.name()))) {
                            System.out.println("Пациента не положили в госпиталь");
                        }

//                        if (!hospital.receivePatient(new Patient(name, health, money, insurance, diagnos))) {
//                            System.out.println("???????? ?? ???????? ? ????????");
//                        }    вот чего-то не пойму зачем повторяются данные строки
                        System.out.println(hospital);
                        break;
                    }
                    case 3: {
                        hospital.heal();
                        System.out.println(hospital);
                        break;
                    }
                    case 4: {
                        hospital.relese();
                        System.out.println(hospital);
                        break;
                    }


                }

            } else System.out.println("Неправильный выбор");
            continue;
        }

    }
}