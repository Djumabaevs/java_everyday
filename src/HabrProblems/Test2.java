package HabrProblems;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {1,7,0,65,3,2,567,6,6,4};
      bubbleSort(array);

    }

    private static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
