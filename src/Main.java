public class Main {
    public static void main(String[] args) {
        System.out.println("No World");
        String [] teste = new String[]{"indis0","indis1","indis2","indis3","indis4","indis5","indis6","indis7","indis8",null,"indis10","indis11"};
        int [] indis = {1,3,9};
        sorting(teste,indis);

        for (String a: teste) {
            System.out.println(a);
        }
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
}