package ExPackageFeb3;

public class PracticeAlgorithms4 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(iterativeSort(15));
        System.out.println(System.currentTimeMillis() - time);
        System.out.println("*****");
        long time2 = System.currentTimeMillis();
        System.out.println(recursiveSort(15));
        System.out.println(System.currentTimeMillis() - time);
        System.out.println("*****");


    }
    private static int recursiveSort(int n){
        if (n == 0){
            return 1;
        }
        return n*recursiveSort(n-1);
    }
    private static int iterativeSort(int n){
        if (n == 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;
        }

        return factorial;

    }
}
