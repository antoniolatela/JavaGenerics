package myPersonalTests;

public class TestsOnArrays {
    static int[] i = new int[10];
    static boolean[] b = new boolean[10];
    static String[] s = new String[10];
    static int[][] ii = new int[2][2];

    public static void main(String[] args) {
        s[0] = "hallo";
        System.out.println(i[9]);
        System.out.println(b[0]);
        System.out.println(s[0]);
        for (char s : s[0].toCharArray()) {
            System.out.println(s);
        }
        int counter = 1;
        for (int y = 0; y < ii.length; y++) {
            for (int z = 0; z < ii[y].length; z++) {
                ii[y][z] = counter++;
            }
        }
        for (int y = 0; y < ii.length; y++) {
            for (int z = 0; z < ii[y].length; z++) {
                String s = "";
                if (ii[y][z]<10) s = " " ;
                System.out.print(ii[y][z] + " "+s);
            }
            System.out.println(" ");
        }

    }
}
