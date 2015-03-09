import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Car[] cars = {new Car(), new Car(), new Car()};
        Race myRace = new Race(500, cars);
        myRace.start();
    }
}
