//If someone enters "   alphabet " (notice the spaces) as input into a method, make that
//method output "alphabeT" instead.

public class Exercise4 {

    public static String textChanger(String input) {
        input = input.strip();
        String lastLetter = input.substring(input.length() - 1);
        String restOfText = input.substring(0,input.length() - 1);
        lastLetter = lastLetter.toUpperCase();
        restOfText = restOfText.toLowerCase();
        return restOfText + lastLetter;
    }

    public static void main(String[] args) {
        System.out.println(textChanger("    alphabet    "));

    }
}
