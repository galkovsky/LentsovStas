public class Race {
    Car[] cars;
    int length;

    public Race(int length, Car[] cars) {
        this.length = length;
        this.cars = cars;
    }

    public void start() {
        for ( int i = 0; i < cars.length; i++) {    // выводит наименование машин
            System.out.print(cars[i].name + " ");}
            System.out.println("");
        while (true) {
            int max = 0;
            int maxPosition = 0;
            while (max < length) {
                for (int i = 0; i < cars.length; i++) { // эта штука делает один цикл движения машин за раз
                    cars[i].move();
                }
                    // штука после каждого цикла определяет максимальное значение позиции и передает в While
                    // while уже решает делает еще один цикл или нет
                    max = cars[0].position;// для начала предположим, что машина с большей скоростью первая
                    for (int j = 1; j < cars.length; j++) {
                    if (cars[j].position > max) {
                        max = cars[j].position; // эта штука оказалась не нужной, но пускай побудет пока
                        maxPosition = j;
                    }
                }
                for ( int i = 0; i < cars.length; i++) {// выводит позиции машин после каждого цикла
                    System.out.print(cars[i].position + " ");}
                System.out.println("");
            }
                System.out.println(cars[maxPosition] + " has been finished the first");
                // а что если сразу несколько машин приезжают одновременно, поможет только фотофиниш
                //   но его у нас пока нет, так что будем считать победителям всех с одинаковой позицией
                for (int b = 1 ; b < cars.length; b++) {
                    if (b == maxPosition) {continue ;}
                    else if (cars [b].position == max) {
                        System.out.println(" and " + cars[b] + " has been finished the first too");
                    }
                }

                System.out.println(""); // отделяет побудителя от резульатов всех участников;
                // блок ниже чтобы наглядно проверить работу программы
                System.out.println("The list of racer's results");
                for ( int n = 0 ; n < cars.length; n++) {
                System.out.println("Racer " + cars[n].name + " have the result: " + cars[n].position);}
                return;
                    }
                }
            }
// так как у нас рандомное ускорение вполне возможен вариант, при котором пока мы ждем? когда пересечет финиш вторая машина
// первая машина может не получить ускорение (замедлится) и вторая машина обгонит первую уже за финишем, что не справедливо.
// справделиво будет после каждой итерации сравнивать, какие из машин пересекли линию финиша: если одна – победитель;
// если две – тогда тот, кто дальше.



