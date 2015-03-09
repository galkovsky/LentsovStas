/**
 * Created by Solvegam on 02.03.2015.
 */
public class main {
    public static void main(String[] args) {
        Publication[] articles = {new Announcement(), new Article(), new News()};
        for (int i = 0; i < articles.length; i++) {
            articles[i].publish () ;
        }
    }
}
