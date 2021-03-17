package ExPackageJan6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexs {

    public static void main(String[] args) {
        String s1 = "ABCD ABCE ABCFAABCGABCH";
        Pattern pattern1 = Pattern.compile("ABCD");
        Pattern pattern2 = Pattern.compile("abc[^e-g4-7]");
        Pattern pattern3 = Pattern.compile("abc(e|5)");
        Matcher matcher1 = pattern1.matcher(s1);
        while(matcher1.find()){
            System.out.println("Position: " + matcher1.start() + "   " + matcher1.group());
        }
    }
}
