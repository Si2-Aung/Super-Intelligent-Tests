import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String test1 = "f0pb07";
        String result1 = toString(test1);
        System.out.println("Tested World : " + test1);
        System.out.println("Expected : I am a F0pb07");
        System.out.println("Actual : " + result1);

        System.out.println("");

        String test2 = "elEvator";
        String result2 = toString(test2);
        System.out.println("Tested World : " + test2);
        System.out.println("Expected : I am an Elevator");
        System.out.println("Actual : " + result2);

        System.out.println("");

        String test3 = "u$a$v";
        String result3 = toString(test3);
        System.out.println("Tested World : " + test3);
        System.out.println("Expected : I am an U a v.");
        System.out.println("Actual : " + result3);

        System.out.println("");

        String test4 = null;
        String result4 = toString(test4);
        System.out.println("Tested World : null" );
        System.out.println("Expected : I am an undefined.");
        System.out.println("Actual : " + result4);


    }

    public static void sorting (String [] teste, int[]indis){
        int i = indis[0];
        int j = indis[1];
        int k = indis[2];

        String tmp = teste[i];

        teste[i] = teste[j];
        teste[j] =teste[k];
        teste[k] = tmp;
    }


    public static String toString(String string) {
        String name= string;
        final int DIFF = 32;
        if (name == null){
            String type= "I am an undefined.";
            return type;
        }else if(name.startsWith("a") ||name.startsWith("e")
                ||name.startsWith("i")||name.startsWith("o")||name.startsWith("u")){
            char[] desTransportTyp = name.toCharArray();
            if (desTransportTyp[0]>90){
                desTransportTyp[0]= (char) ( desTransportTyp[0] - DIFF );
            }
            for (int i = 1; i < name.length(); i++) {
                if (desTransportTyp[i]<91&&desTransportTyp[0]>64){
                    desTransportTyp[i]= (char) ( desTransportTyp[0] +DIFF );
                }
                if (desTransportTyp[i]<65&&desTransportTyp[i]>10||desTransportTyp[i]>123){
                    desTransportTyp[i]= ' ';
                }
            }
            String result = new String (desTransportTyp)  ;
            return "I am an "+ result + ".";
        }else {
            char[] desTransportTyp = name.toCharArray();
            if (desTransportTyp[0]>90){
                desTransportTyp[0]= (char) ( desTransportTyp[0] - DIFF );
            }
            for (int i = 1; i < name.length(); i++) {
                if (desTransportTyp[i]<91&&desTransportTyp[0]>64){
                    desTransportTyp[i]= (char) ( desTransportTyp[0] +DIFF );
                }
                if (desTransportTyp[i]<65&&desTransportTyp[i]>10||desTransportTyp[i]>123){
                    desTransportTyp[i]= ' ';
                }
            }
            String result = new String (desTransportTyp)  ;
            return "I am a "+ result + ".";
        }
    }
}