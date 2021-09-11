import java.util.Arrays;
import java.util.Random;

public class MyClass {
        public static void main (String args[])
        {
            int [] dado = new int[7];
            System.out.println(MyClass.lanciaDado());
            MyClass.lanciaDado();
        }

        private static int lanciaDado()
        {
            Random tiroDado = new Random();
            int valoreDado = tiroDado.nextInt(6);
            return valoreDado +1;
        }
}
