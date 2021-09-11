import javax.swing.text.StringContent;
import java.util.Scanner;

public class RimpiazzaIntrusi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String a = sc.nextLine();
        System.out.print("Enter string:");
        String b = sc.nextLine();
        System.out.print("Enter string:");
        String c = sc.nextLine();
        replaceIntruder(a, b, c);
    }

    private static void replaceIntruder(String a, String b, String c) {
        String end = (a) + (b) + (c);
        String[] split = end.split(" ");
        {
            if (end.startsWith(a + b))
                System.out.println(b +" "+ b + " " + c);
            else System.out.println(end);
        }
    }
}