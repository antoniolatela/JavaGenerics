
package myPersonalTests;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String line = sc.nextLine();
            if (line.equals("end")) {
                System.out.println("bye");
                break;
            } else {
                System.out.println(line);
            }
        }
        while (sc.hasNext()){
            Double d = sc.nextDouble();
            System.out.println(d);
        }
    }
}
