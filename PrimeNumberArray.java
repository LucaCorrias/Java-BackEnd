import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Scrivi un numero:");
        int numero = sc.nextInt();
        int [] arrayBase = new int[numero];
        System.out.println("I numeri primi a partire da "+numero+ " sono: " + Arrays.toString(arrayBase))
    }

    private static boolean isPrime(int numero, int[] arrayPrimi) {
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {//restituisco numeri non primi-false
            }
        }
        int [] arrayPrimi // restituire true su condizione soddisfatta(numprimo)
    }                     // aggiungere valori primi ad array/tracciare
                          //
}