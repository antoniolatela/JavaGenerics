import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;

public class SintaxExample {
    public static void main(String[] args) {
        //int[] a = new int[10];
        ArrayList<Integer> a = new ArrayList<>();
        //ArrayList a = new ArrayList();
        a.add(15);
        //a.add("15");
        Integer b = (Integer)a.get(0);

        OrderPair<Integer,String> op1 = new OrderPairClass<>(1, "Antonio");
        OrderPair<SintaxExample,Date> op2 = new OrderPairClass<>(new SintaxExample(), new Date());
        print(op1.getKey(), op1.getValue());
        print(op2.getKey(), op2.getValue());
        
    }

    public static <k, v>  void print(k key, v value) {
        System.out.println("Key: " + key + " Value: " + value);
    }

    @Override
    public String toString() {
        return "Hi, I'm SintaxExample{}";
    }
}

