public class Tester {

    public static int[] bubblesort(int[] toSort) {
        int [] result = toSort;
        for (int i = 0; i < result.length-1; i++) {
            for (int j = 0; j < result.length-i-1; j++) {
                int k = j+1;
                if(result[j] > result[k]) {
                    int tmp = result[j];
                    result[j] = result[k];
                    result[k] = tmp;
                    k++;
                }
            }
        }
        return result;
    }

}
