import java.util.Arrays;
import java.util.Arrays;

public class HanoiTower {

    public static void main(String[] args) {
        String [] test = Hanoi(4,"A","C");

        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i] + "-->");
        }

    }

    private static String [] Hanoi (int n, String i, String j){

        if (n == 1) {
            String tmp = "("+i+","+j+")";
            return new String[]{tmp};
        }

        else {
            String h = hilfStabRechner(i,j);
            String[] A = Hanoi(n - 1, i, h);

            String tmp = "("+i+","+j+")";
            String[] C = new String[]{tmp};
            String[] D = merging(A,C);

            String[] B = Hanoi(n - 1, h, j);
            return merging(D,B);
        }


    }

    private static String hilfStabRechner (String i, String j){
        int iZahl = 0;
        int jZahl = 0;
        int hZahl;

        if(i == "A") iZahl=0;
        if(i == "B") iZahl=1;
        if(i == "C") iZahl=2;

        if(j == "A") jZahl=0;
        if(j == "B") jZahl=1;
        if(j == "C") jZahl=2;

        hZahl = 3 - (iZahl+jZahl);
        if(hZahl == 0)  return "A";
        if(hZahl == 1)  return "B";
        if(hZahl == 2)  return "C";

        else return "10000";

    }

    private static String[] merging(String[] a, String[] b){
        int a1 = a.length;

        // determines length of secondArray
        int b1 = b.length;

        // resultant array size
        int c1 = a1 + b1;

        // create the resultant array
        String[] c = new String[c1];

        // using the pre-defined function arraycopy
        System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);

        return c;

    }


}
