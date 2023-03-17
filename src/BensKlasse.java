import java.util.concurrent.ThreadLocalRandom;

public class BensKlasse{


    public static void main(String[] args) {
        int a = ThreadLocalRandom.current().nextInt(13,18);
        System.out.println(a);
    }


    public static int test(int a, int b) {

        a = a+b;
        for(int i= 0; i <5; i++){
            a = a+b+1;
            a = a-b;
        }
        String hallo = "Hallo";
        while (hallo == "hallo"){
            b = a-b ;
            break;
        }
        return a;

    }
}
