/**
 * Created by Solvegam on 02.03.2015.
 */
public class News extends Publication {

    String text = "Нудная новость про отмену проекта MARS 500";

    public void publish() {
        System.out.println("-------NEWS-------");
        super.text = text;
        super.publish();
    }
}