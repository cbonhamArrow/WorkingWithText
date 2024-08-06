//Given the String “12345 Big St., Alphabet City, CA 90210” or any other address
//with the same format, can you write code that can parse and print out:

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise5 {

    static String address = "12345 Big St., Alphabet City, CA 90210";

    public static void parseAddress(String address) {
        String regex = "(?<buildingNumber>\\d*+)\\s(?<street>\\w*+\\s\\w*+[.]?),\\s(?<city>\\w*+\\s\\w*+),\\s(?<state>\\w{2})\\s(?<postalCode>\\d{5})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(address);

        if (matcher.matches()) {
            System.out.println("Building Number: " + matcher.group("buildingNumber"));
            System.out.println("Street name: " + matcher.group("street"));
            System.out.println("City: " + matcher.group("city"));
            System.out.println("State: " + matcher.group("state"));
            System.out.println("Postal Code: " + matcher.group("postalCode"));
        }
    }

    public static void main(String[] args) {
        parseAddress(address);
    }
}
