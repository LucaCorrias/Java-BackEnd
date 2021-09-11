import java.util.Scanner;

public class OperazioniAritmetiche {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        computeValues(a, b);

    }

    private static void computeValues(int a, int b) {

        int somma = (a+b);
        int diff = (a-b);
        int mult = (a*b);
        int divs =  (a/b);
        System.out.println (somma);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(divs);}

}