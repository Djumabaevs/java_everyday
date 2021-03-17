package LeetCodeProblems;

public class Test8 {
    public int maxArea(int[] height){

        int maxArea = 0;
        for(int i = 0; i < height.length; i ++) {
            for(int j = i + 1; j < height.length; j++){
                maxArea = Math.max( maxArea, Math.min(height[i], (height[j]) * (j - 1) ));
            }
        }
        return maxArea;
    }


//2nd approach

public int maxArea2(int[] height) {
    int maxArea = 0, l = 0, r = height.length - 1;
    while (l < r) {
        maxArea = Math.max(maxArea, (height[r] * (r - l)));
        if (height[l] < height[r]) {
            l++;
        } else {
            r--;
        }
    }
    return maxArea;
   }
 }
