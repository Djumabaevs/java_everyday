package ExPackageJan6;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexs2 {
    public static void main(String[] args) {
        String s = "Djumabaev Bakyt, Kyrgyzstan, Bishkek, Street district, 12, House 57, Flat 66," +
                "email: bakyt@gmail.com, Phone number: +123456779;" +
                "Djumabaev Taalai, Kyrgyzstan, Bishkek, Street district, 12, House 57, Flat 66," +
                "email: talka@mail.ru, Phone number: +123456889;";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher1 = pattern.matcher(s);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        System.out.println("--------------------------------------------------------------------");

        Pattern pattern2 = Pattern.compile("\\b\\d{2}\\b");
        Matcher matcher2 = pattern2.matcher(s);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
            System.out.println("--------------------------------------------------------------------");

        }
        Pattern pattern3 = Pattern.compile("\\+\\d{2}\\b");
        Matcher matcher3 = pattern3.matcher(s);
        while (matcher3.find()) {
            System.out.println(matcher3.group());
            System.out.println("--------------------------------------------------------------------");
        }
        Pattern pattern4 = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher4 = pattern4.matcher(s);
        while (matcher4.find()) {
            System.out.println(matcher4.group());
            System.out.println("--------------------------------------------------------------------");

        }
        String[] s2 = s.split(" ");
        System.out.println(Arrays.toString(s2));



    }
}