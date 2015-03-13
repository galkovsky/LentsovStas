//package com.company;

public class Patient extends Human implements Ailing {
    private int health;
    private int money;
    private boolean insurance;
    private String diagnosis;

    public Patient(String name, int health, int money, boolean insurance, String diagnosis) {
        this.name=name;
        this.health = health;
        this.money = money;
        this.insurance = insurance;
        this.diagnosis = diagnosis;
    }

    @Override
    public boolean increase(int health, int cost){
        if (!insurance) {
            money -= cost;
        };
        this.health+=health;
        return health >= 100;
    }

    @Override
    public boolean relesedoctor(){
        if (health>=100 && money==0) {
        System.out.println("Пациент "+name+" выписался. Без денег, но здоров");
            return true;
        }
        else if (health>=100 && money>0) {
        System.out.println("Пациент "+name+" выписался. И у него еще и деньги остались.");
            return true;
        }
        else if (health<100 && money==0 && !insurance) {
            System.out.println("Пациент "+name+" выписан из-за недостатка денег");
            return true;
        }
        else return false;
    }

    @Override
    public boolean relesehospital() {
        if (health >= 100 || money == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Пациент "+name+" имеет health - "+ health+", money - "+ money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isInsurance() {
        return insurance;
    }

    @Override
    public String getName() {
        return name;
    }




}

