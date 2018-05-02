package GenericsReview;

import java.util.ArrayList;
import java.util.List;

public class RowType {
    List<Integer> l1 = new ArrayList<>();
    List l2 = l1; //Do no use rawType when possible!

    List l3 = new ArrayList();
    List<Integer> l4 = l3;

    public static void main(String[] args) {
        new RowType();
    }
}
