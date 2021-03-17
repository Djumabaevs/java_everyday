package HabrProblems;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(10, 5);
        System.out.println(vectors[0]);
        System.out.println(vectors[0].length());

    }
}
class Vector{
    private double[] values;
    public Vector(double[] values){
        this.values = values;
    }

    public Vector() {

    }

    public double length(){
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i] * values[i];
        }
        return Math.sqrt(sum);
    }
    public double scalarProduct(Vector vector) {
        double res = 0;
        for (int i = 0; i < values.length; i++) {
            res += values[i] * vector.values[i];
        }
        return res;
    }
    public double cos(Vector vector){
        return scalarProduct(vector)/(length()* vector.length());
    }
    private static double[] generateRandomArray(int length){
        double[] array = new double[length];
        for(int i = 0; i < array.length; i++){
            array[i] = Math.random();
        }
        return array;
    }
    public static Vector[] generate(int n, int dimension){
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(generateRandomArray(dimension));
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "values=" + Arrays.toString(values) +
                '}';
    }
}
