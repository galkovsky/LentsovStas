/**
 * Created by Solvegam on 03.03.2015.
 */
public class main {

    public static void main(String [] args) {
        Bookshelf first = new Bookshelf (1,2);
        Bookshelf second = first;
        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println("");
        Bookshelf third = new Bookshelf (1,2);
        Bookshelf fourth = new Bookshelf (1,2);
        System.out.println(third == fourth);
        System.out.println(third.equals(fourth));
        System.out.println("");
    }

}
