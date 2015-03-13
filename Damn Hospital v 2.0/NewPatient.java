public class NewPatient implements Ailing {
    @Override
    public boolean increase(int health, int cost) {
        return false;
    }

    @Override
    public boolean relesedoctor() {
        return false;
    }

    @Override
    public boolean relesehospital() {
        return false;
    }

    @Override
    public int getMoney() {
        return 0;
    }

    @Override
    public String getDiagnosis() {
        return null;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public boolean isInsurance() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
