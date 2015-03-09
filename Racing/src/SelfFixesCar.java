import java.io.IOException;

/**
 * Created by Solvegam on 01.03.2015.
 */
public class SelfFixesCar extends Car {
    int repare = 0;// переменная для переключателя "показывать/не показывать"
    public SelfFixesCar() throws IOException {
    }

    public void move() {
            if (repare == 1) {System.out.println("Car " + name + " was fixed");// данный текст выводится только после ремонта
                repare = 0;}
            if (crashChance < 90){
            super.move();}
        else {
            System.out.println("Car " + name + " crashed");
            crashChance = 0;
            repare = 1;
        }
    }
}
