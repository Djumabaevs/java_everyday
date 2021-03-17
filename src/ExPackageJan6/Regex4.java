package ExPackageJan6;

import java.util.Arrays;

public class Regex4 {
    public static void main(String[] args) {
        String a = "-5643";
        String b = "5643";
        String c = "+5643";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        String d = "gjgjSFjgjjhb767757775";
        System.out.println(d.matches("[a-zA-Z]+\\d+"));
        String e = "hello";
        System.out.println(e.matches("[^abc]*"));
        String url = "http://www.kicb.kg";
        System.out.println(url.matches("http://www\\..+\\.(com|kg)"));

        String str = "Hello68573987937there987979794hey8799798wow";
        String[] str2 = str.split("\\d+");
        System.out.println(Arrays.toString(str2));

        String str3 = str.replaceAll("\\d+", "-");
        System.out.println(str3);
    }
}
