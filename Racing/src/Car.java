
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    int position;
    int n2o;
    int speed;
    String name;
    double crashChance;
    int numberOfCrash = 0;// нужно чтобы не выводить сообщение о поломке каждый раз
    public void move() {
        //убрал строку "position += speed", чтобы не задваитвать скорость при расчете позиции

        if (crashChance < 90 ) {

            if ((Math.random() * 100) > 60) {
                position += speed + n2o;
            } else {
                position += speed;
            }
            crashChance += 10; // износ машины на дистанции
        }
        else {
            if ( numberOfCrash < 1){ // при поломке машины ввыдится надпись только раз
            System.out.println("The car " + name + " is broken");}
            numberOfCrash ++;

        }
    }
    public Car() throws IOException {
        System.out.println("Введите поочередно в строках название машины, скорость и ускорение (участвуют 3 машины)");

        BufferedReader reader = new BufferedReader (new InputStreamReader( System.in)); // считывалка

        String carName = reader.readLine(); // считываем данные
        String carSpeedText = reader.readLine();
        String carN2oText = reader.readLine();

        int carSpeed = Integer.parseInt(carSpeedText); // преобразуем в числа
        int carN2o = Integer.parseInt(carN2oText);

        this.name = carName; // присваиваем полученные значения объекту
        this.speed = carSpeed;
        this.n2o = carN2o;
        this.position = 0;
        this.crashChance = (Math.random()*100) ; // инициализируется вероятность поломки
    }

    public String toString(){
        return "Car " + name + " with speed: " + speed + " and nitro " + n2o + " and the position is " + position;
    }
}

