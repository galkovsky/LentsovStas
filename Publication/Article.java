/**
 * Created by Solvegam on 02.03.2015.
 */
public class Article extends Publication {
    String text = "Интригующая о Стивене Хокинге, который смог";
    public void publish () {
        super.text = text;
        System.out.println("-------ARTICLE--------");
        super.publish();
    }
}
