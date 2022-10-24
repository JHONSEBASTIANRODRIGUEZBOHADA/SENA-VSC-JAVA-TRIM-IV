package EJERCICIOS;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        int aleatorio, nUsuario, total;

        Random random = new Random();
        aleatorio = random.nextInt(1,10);

        Scanner scanner = new Scanner(System.in);

        System.out.println("NUMERO ALEATORIO");
        System.out.println("Ingrese un numero del 1 al 10");
        nUsuario = scanner.nextInt();

        if (nUsuario <= 10)
        {
            total = aleatorio + nUsuario;

            System.out.println("Numero aleatorio= " + aleatorio);
            System.out.println("Numero usuario= " + nUsuario);
            System.out.println("Total= " + total);
        }
        else
        {
            System.out.println("Numero invalido");
        }
        scanner.close();
    }
}
