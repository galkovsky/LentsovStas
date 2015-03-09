/**
 * Created by Solvegam on 03.03.2015.
 */
public class Bookshelf {
    int hight;
    int width;

   public Bookshelf (int hight, int width) {
        this.hight = hight;
        this.width = width;
    }
    public boolean equals (Object obj) {
        if (this == obj) {
            return true;
        }
        else {
            return false;
        }
        if (obj == null) {
            return false;
        }
        else {
            return true;
        }

        if ( obj.getClass() == this.getClass() ) {
            Bookshelf mmmm = (Bookshelf)obj;
           if (this.hight == mmmm.hight && this.width == mmmm.width) {
               return true;}
            else {return false;}
           }
        }
        else {return false;}

                    }

