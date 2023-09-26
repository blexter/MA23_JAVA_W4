import java.util.ArrayList;

public class Null {
    public static void main(String[] args) {
        Null_Rectangle rec = new Null_Rectangle(3.0,4.0);
        Null_Rectangle rec2 = new Null_Rectangle(3.0,4.0);
        Null_Rectangle rec3= new Null_Rectangle(3.0,4.0);
        Null_Rectangle rec4 = new Null_Rectangle(3.0,4.0);

        rec3 = null;
        ArrayList<Null_Rectangle> recList = new ArrayList<>();

        recList.add(rec);
        recList.add(rec2);
        recList.add(rec3);
        recList.add(rec4);


        for(Null_Rectangle rectangle : recList) {
            if (rectangle != null) {
                System.out.println(rectangle.getHeight());
            }
        }


    }
}