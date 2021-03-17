package ExPackageFeb3;

public class PracticeAlgorithms5 {
    public static void main(String[] args) {
        int[] array = new int[90_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        // System.out.println(Arrays.toString(array));
        long time = System.currentTimeMillis();
        gapMethod(array);
        System.out.println(System.currentTimeMillis() - time);
    }
    private static void gapMethod(int[] array) {
        for (int gap = array.length/2; gap > 0; gap /= 2){
            for(int i = gap; i < array.length; i++){
                int newElement = array[i];
                int j = i;
                while(j >= gap && array[j - gap] > newElement){
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }

        }
    }
}
