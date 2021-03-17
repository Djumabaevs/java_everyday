package LeetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static int[] sumOfTwo(int[] sum, int target){
        for (int i = 0; i < sum.length; i++) {
            for (int j = i+1; j < sum.length; j++) {
                if(sum[j] == target - sum[i]){
                    return new int[] {i,j};
                }
            }
        }
        try {
            throw new IllegalAccessException("no two sum solution");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return new int[]{0,0};
    }

    // 2nd approach to improve time complexity, using hashMap

    public static int[] sumOfTwo2(int[] sum, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sum.length; i++) {
            map.put(sum[i], i );
        }
        for (int i = 0; i < sum.length; i++) {
            int complement = target - sum[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                return new int[]{i, map.get(complement)};
            }
        }
        return new int[]{0,0};
    }

    // 3rd approach using one iteration

    public static int[] sumOfTwo3(int[]array, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(array[i], i);
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,6,3,2,7,5};
        System.out.println(Arrays.toString(sumOfTwo2(array,7)));
        System.out.println(Arrays.toString(sumOfTwo(array,7)));
        System.out.println(Arrays.toString(sumOfTwo3(array,7)));
    }

}

