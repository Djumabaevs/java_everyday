package ExPackageFeb5;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Doing {
    public static void main(String[] args) {
    int[] array = {99,54,33,21,5,31,0,6};
      mergeS(array,0,7);
     System.out.println(Arrays.toString(array));
    }
    private static void mergeS(int[] array,int start, int end){

        if (start < end) {

            int mid = (start + end) / 2;
            mergeS(array, start, mid);
            mergeS(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }
    private static void merge(int[]array, int start, int mid, int end){

        int[] tempArray = new int[end - start +1];
        int left = start;
        int right = mid+1;
        int k=0;

        while(left <= mid && right <=end){
            if(array[left] < array[right]){
                tempArray[k] = array[left];
                left++;
            } else {
                tempArray[k] = array[right];
                right++;
            }
            k++;
        }
        if(left<=mid){
                while(left<=mid){
                    tempArray[k] = array[left];
                    left++;
                    k++;

                }

        } else if (right <= end){
            while(right <= end){
                tempArray[k] = array[right];
                right++;
                k++;
            }
        }
        for (int i = 0; i < tempArray.length; i++) {
            array[start +i] = tempArray[i];
        }

        }

    }

