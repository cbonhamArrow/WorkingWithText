//How can you make sure when people enter text into a program, there are no unintended spaces
//at the beginning or end of the text?

public class Exercise3 {

    public static void main(String[] args) {
        String input = System.console().readLine("Enter text:");
        input = input.strip();
        System.out.println(input);
    }
}
