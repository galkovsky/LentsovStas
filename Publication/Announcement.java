/**
 * Created by Solvegam on 02.03.2015.
 */
public class Announcement extends Publication {
        String text = "Какое-то странное объявление о продаже акций компании Apple по цене доллар за акцию";
    public void publish () {
        super.text = text;
        System.out.println("------Announcment-----");
        super.publish();
    }
}
