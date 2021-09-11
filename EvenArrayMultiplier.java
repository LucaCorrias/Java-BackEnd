import java.util.Arrays;
import java.util.Scanner;

public class EvenArrayMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int a = sc.nextInt();
        System.out.print("Enter number 2:");
        int b = sc.nextInt();
        System.out.print("Enter number 3:");
        int c = sc.nextInt();
        System.out.print("Enter number 4:");
        int d = sc.nextInt();
        System.out.print("Enter number 5:");
        int e = sc.nextInt();
        int[] arrayBase = {a, b, c, d, e};
        int[] nuovoArr = computeValues(arrayBase);
        System.out.println(Arrays.toString(nuovoArr));
    }

    private static int[] computeValues(int[] arrayBase) {
        int[] arrayNew = new int[arrayBase.length];
        for (int i = 0; i < arrayBase.length; i++) {
            if (arrayBase[i] % 2 != 0)
                arrayNew[i] = arrayBase[i] * 2;
            else
                arrayNew[i] = arrayBase[i];
        }
        return arrayNew;
    }
}
