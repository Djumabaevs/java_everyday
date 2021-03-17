package ExPackageJan6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {

        String myString = "12662792746272836272890;" + " 74839573620094734638926";

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");

        Matcher matcher = pattern.matcher(myString);

        String newString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");

         System.out.println(newString);

        while (matcher.find()){
            System.out.println(matcher.group());


        }
    }
}
