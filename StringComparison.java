public class StringComparison {
    public static void main(String[] args) {
        String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come va ";
        System.out.println("2".equals("" + compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIaoo come vA ?";
        c = "ciao come va a";
        System.out.println("1".equals("" + compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        System.out.println("3".equals("" + compareStrings(a, b, c)));
    }

    private static int compareStrings(String a, String b, String c) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        c = c.toLowerCase();

        String alfa = "1";
        String beta= "2";
        String gamma= "3";

        if (a.equals(b) && b.equals(c))
            System.out.println(gamma);
        else if (a.equals(b) || b.equals(c) || a.equals(c))
            System.out.println(beta);
        else System.out.println(alfa);
        return 0;
        }
    }