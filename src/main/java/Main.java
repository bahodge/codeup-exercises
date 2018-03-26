import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World");
//        Checks if Numeric
        System.out.println(StringUtils.isNumeric("2")); //True
        System.out.println(StringUtils.isNumeric("Cookies")); //False
//        Flipped Case
        System.out.println(StringUtils.swapCase("i am only an island"));
//        Reversed String
        System.out.println(StringUtils.reverse("You are so cool!"));
//        ###################Final Tests ###################//
//        Enter String
        System.out.print("Enter a String: ");
        String userInput = sc.nextLine();
        System.out.println("You entered: " + userInput);
        String quote = "\"";
        System.out.println("You Entered " + quote + userInput + quote);

//        Check if input is number
        if (StringUtils.isNumeric(userInput)){
            System.out.println(quote + userInput + quote + " is a number");
        } else {
            System.out.println(quote + userInput + quote + " is not a number");
        }
//        Flipped Case
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
//        Reversed
        System.out.println("Reversed String: " + StringUtils.reverse(userInput));
//        Contains Vowels Upper/lower
        System.out.println(StringUtils.containsAny(userInput, 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    }
}
