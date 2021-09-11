import java.util.Arrays;
import java.util.Random;

public class NuovaClasse {
    public static void main(String[] args) {
        String[] tripChooser = new String [5];
        tripChooser[0] = "Baunei";
        tripChooser[1] = "Barisardo";
        tripChooser[2] = "Cagliari";
        tripChooser[3] = "Oliena";
        tripChooser[4] = "Palau";
        System.out.println(Arrays.toString(tripChooser));
        ExtractRandString(tripChooser);
        }
    private static String ExtractRandString (String[] paesi) {
        Random stringaRand = new Random();
        int cellaStringaRand = stringaRand.nextInt(paesi.length);
        return paesi[cellaStringaRand];
    }
}
