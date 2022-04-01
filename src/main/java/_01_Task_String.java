import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _01_Task_String {
    public static void main(String[] args) {
        //String characters = "!veDJaCyd vaeo perelo xw";
        //String document = "Cydeo Java Developer!";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first characters");
        String characters = input.next();
        System.out.println("Please enter document");
        String document = input.next();

        generateWithString(characters,document);
        generateRecursive(characters,document);
        generateWithStream(characters,document);

    }

    private static void generateWithStream(String characters, String document) {

        //try it later

    }

    private static void generateRecursive(String characters, String document ) {
      // try it later

    }

    private static void generateWithString(String characters, String document) {

        String result = "we can generate this document with these characters";

        for (int i = 0; i < document.length(); i++) {

            if(characters.indexOf(document.charAt(i)) != -1) {
                characters = characters.replaceFirst("" + document.charAt(i), "");
            } else {
                result = "we can`t genarate this string with these characters";
                break;
            }
        }

        System.out.println(result);
    }
}
