package HabrProblems;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int[] array = {11,12,14,6,3,67,4,2,1,86};
        System.out.println(Arrays.toString(removeElement(array,3)));
    }
    private static int[] removeElement(int[] numbers, int value) {
        int index=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == value){
                index++;
            } else {
                numbers[i - index] = numbers[i];
            }
        }
        int[] newArray  =new int[numbers.length - index];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = numbers[i];

        }
        return newArray;
      //  return Arrays.copyOf(numbers, numbers.length - index);
    }
}
