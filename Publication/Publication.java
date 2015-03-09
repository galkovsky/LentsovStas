import java.time.LocalDate;

/**
 * Created by Solvegam on 02.03.2015.
 */
public class Publication {
    String text;
    public void publish () {
        LocalDate date = LocalDate.now();
        System.out.println("");
        System.out.println(text);
        System.out.println("");
        System.out.println(date);
        System.out.println("");
        System.out.println("");
    }
}
