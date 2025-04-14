package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

    public static boolean checkString(String text) {
        Pattern pattern = Pattern.compile("^(?!.*no damages)(?=.*damage)(?=.*minor damages)(?=.*heavy damage)");
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }

    public static void main(String[] args) {
        String text = "There is damage, minor damages, and heavy damage.";

        System.out.println(checkString(text));
    }
}
