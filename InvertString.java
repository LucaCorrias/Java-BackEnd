import javax.print.DocFlavor;
import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        reverseString(a);
    }

    private static String reverseString(String a) {
        String[] split = a.split(" ");
        System.out.println(split[1] + " " + split[0]);
        String test = "";


        for (int b = split.length -1; b >= 0; b--) {
            test += split[b];
            System.out.println(test);
        }
        return test;
    }
}
