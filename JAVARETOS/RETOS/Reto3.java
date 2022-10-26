package RETOS;
import java.util.*;

public class Reto3 {
    public static void main(String[] args)
    {
        int monedaUsuario, monedaAleatoria;

        monedaAleatoria =  (int)(Math.random()*2+1);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCARISELLAZO");

        System.out.println("\nLA MONEDA ESTA GIRANDO....");

        System.out.println("\nElija: (1.Cara) o (2.Sello)");
        monedaUsuario = scanner.nextInt();

        if (monedaAleatoria == monedaUsuario)
        {
            System.out.println("ENHORABUENA: HAS GANADO");
        }
        else
        {
            System.out.println("SIGUE INTENTANDO: HAS PERDIDO");
        }
        scanner.close();
    }
}
