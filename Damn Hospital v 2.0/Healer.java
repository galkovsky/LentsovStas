public interface Healer extends Ailing{
    void heal();

    boolean ifCanHeal(Ailing patient);

    void addPatient(Ailing patient);

    Ailing[] relese();
}
