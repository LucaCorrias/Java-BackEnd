import java.util.Scanner;

public class calcolotempo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seconds:");
        long secondi = sc.nextInt();
        computeValues(secondi);
    }

    private static void computeValues (long secondi) {

        long giorni = secondi / 86400;
        long rGiorni = secondi % 86400;
        long ore = rGiorni / 3600;
        long rOre = secondi % 3600;
        long minuti = rOre / 60;
        long rMinuti = rOre % 60;
        System.out.println(secondi+" secondi equivalgono a "+giorni+" giorni, "+ore+" ore, "+minuti+" minuti e "+rMinuti+" secondi.");

        //in questi casi può essere utili usare String.valueOf(giorni/secondi/altro) per printare
    }
}