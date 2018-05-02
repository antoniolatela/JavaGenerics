package GenericsReview;

import java.util.ArrayList;

public class GenericsTwo {
    public static void main(String[] args) {
/*        ArrayList a = new ArrayList();
        a.add(15);
        a.add("15");
        int v = (Integer)a.get(1); //Error with non generic*/
        ArrayList<Integer> a = new ArrayList<>();
        a.add(15);
        //a.add("15"); Error since the arraylist was created with generic <Integer>
        Integer i = a.get(0);
    }
}
