package Generics;

import java.util.ArrayList;
import java.util.List;

public class Bin<D, W> {

    private D dryTrash;
    private W wetTrash;

    public D getD() {
        return dryTrash;
    }
    public void setD(D dryTrash) {
        this.dryTrash = dryTrash;
    }
    public W getW() {
        return wetTrash;
    }
    public void setW(W wetTrash) {
        this.wetTrash = wetTrash;
    }
}
class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Bakyt");
        list.add("Talka");

        for(String object : list) {
            String str = object;
            System.out.println(str);
        }
        Bin<String, Integer> bin = new Bin<>();
        bin.setD("sjichwichwin");
        bin.setW(57547817);
        System.out.println(bin.getD() + " " + bin.getW());

    }
}
