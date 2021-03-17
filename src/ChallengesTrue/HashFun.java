package ChallengesTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HashFun {

    String[] hashArray;
    int arraySize;
    int size = 0; //counter for number of elements in the hash table

    public static void main(String[] args) {

    }

    public HashFun(int noOfSlots){

        if(isPrime(noOfSlots)){
            hashArray = new String[noOfSlots];
            arraySize = noOfSlots;
        } else {
            int primeCount = getNextPrime(noOfSlots);
            hashArray = new String[primeCount];
            arraySize = primeCount;

            System.out.println("HashTable size given: " + noOfSlots + "is not a prime number!");
            System.out.println(("Size has changed to: " + primeCount));
        }
    }

    private int hashFun1(String word){
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;
        if(hashVal < 0) {
            hashVal += arraySize;
        }
        return hashVal; //ideal index position we'd like to insert or search
    }

    private int hashFun2(String word){
        int hashVal = word.hashCode();
        hashVal %= arraySize;
        if(hashVal < 0){
            hashVal += arraySize;
        }
        return 3 - hashVal % 3; // use a prime number less than array size
    }

    private int getNextPrime(int minNumber){
        for(int i = minNumber; true; i++){
            if(isPrime(i)){
                return i;
            }
        }
    }

    private boolean isPrime(int num){
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public void insert(String word){
        int hashVal = hashFun1(word);
        int stepSize = hashFun2(word);

        while(hashArray[hashVal] != null){
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = word;
        System.out.println("inserted word : "  + word);
        size++;
    }

    public String find(String word){
        int hashVal = hashFun1(word);
        int stepSize = hashFun2(word);

        while(hashArray[hashVal] != null){
            if(hashArray[hashVal].equals(word)){
                return hashArray[hashVal];
            }
            hashVal += stepSize;
            hashVal %= arraySize;
        }
        return hashArray[hashVal];
    }

    public void displayTable(){
        System.out.println("Table: ");
        for (int i = 0; i < arraySize; i++) {
            if(hashArray[i] != null){
                System.out.println(hashArray[i] + " ");
            } else {
                System.out.println("** ");
            }
            System.out.println(" ");
        }
    }
}
