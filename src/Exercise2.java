//Write code that replaces the word "cat" with the word "dog" wherever it shows up in a sentence.

public class Exercise2 {

    static String sentence = "Hello this is my sentence about cats and dogs.";

    public static void main(String[] args) {
        if (sentence.contains("cat")) {
            sentence = sentence.replace("cat", "dog");
        }

        System.out.println(sentence);
    }
}
