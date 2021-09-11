/*import java.util.Arrays;
import java.util.Scanner;

public class tabelline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int n = sc.nextInt();
        System.out.print("Enter number 2:");
        int m = sc.nextInt();
        int[] arrayBase = new int [];
        int[] nuovoArray = computeValues(arrayBase);
        System.out.println(Arrays.toString(nuovoArray));
    }

    public static int[] computeValues(int[] arrayBase) {
        int [] arrayNew = new int [arrayBase.length];
        for (int i=0; i <arrayBase.length;i++) {
            arrayNew [i] = arrayBase [i] * arrayBase.length;

        }
        return arrayNew;
    }
}  //arrayNew[i] con lunghezza = i*m;
   //arrayNew[i] = arrayBase [i]*n ogni cella [i] ha valore i*n
   //arrayBase.length = arrayBase[i] * array

 */