package EJERCICIOS;
import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args) 
    {
        int edad, intentar;

        Scanner scanner = new Scanner(System.in);

        do
        {
            for (int i = 0; i < 25; i++)
            {
                System.out.println("Ingrese su edad");
            
                edad = scanner.nextInt();
            
                if (edad <= 0)
                {
                    System.out.println("Valor invalido");
                }
                else if (edad < 18)
                {
                    System.out.println("Váyase a dormir, usted es menor de edad");
                }
                else
                {
                    System.out.println("Bienvenido a la discoteca SENA");
                }
            }
            System.out.println("Finalizo la consulta de edades");
            System.out.println("Ingrese (0) si quiere pedir las edades. Ingrese (otro numero) si quiere salir");
            intentar = scanner.nextInt();
        }while(intentar == 0);
        scanner.close();    
    }
}
