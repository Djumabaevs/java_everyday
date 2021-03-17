package Generics;

import java.util.Arrays;
import java.util.List;

public class DataSorter<T> {
    private final List<T> list;
    public DataSorter(List<T> list) {
        this.list = list;
    }
    public void getSortedData() {
        list.sort(null);
        for(T t : list) {
            System.out.println(t);
        }
    }
}
class BoundedT {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(new Integer[] {12,13,14,15});
        List<String> list2 = Arrays.asList(new String[] {"Bakyt", "Talka"});
        DataSorter<Integer> sorter1 = new DataSorter<>(list1);
        DataSorter<String> sorter2 = new DataSorter<>(list2);
        sorter1.getSortedData();
        sorter2.getSortedData();
        CBound b = new CBound();
        getSortedData2(b);

    }
    public static <T extends IBound> void getSortedData(List<T> list) {
        list.sort(null);
        for(T t : list) {
            System.out.println(t);
        }
    }
    public static <T extends IBound & IBound2> void getSortedData2(T list) {

    }
}
interface IBound {}
interface IBound2 {}
class CBound implements IBound, IBound2{}
