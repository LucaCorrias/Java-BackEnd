    import java.util.Scanner;

    public class CountAMole {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter character a:");
            String a = sc.nextLine();
            System.out.print("Enter string b:");
            String b =sc.nextLine();
            countmoles(a.charAt(0), b);
        }

        static void countmoles(char a, String b) {
            int moles = 0;
                for (int i=0; i<b.length(); i++)      //ricorda di settare sempre questo genere di indici come inferiori in dimensioni
                    if(b.charAt(i) == a)          //alla stringa di riferimento, onde evitare outofbounds del gazo
                        moles++;
            System.out.println(moles);

                //giocare su char index o array e richiamarlo con un for su char presente incrementale tipo for(posizione++)
                //for    (int i = 0; i<=b.length(); i++) talpe=i?;
        }
}
