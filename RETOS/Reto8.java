package RETOS;
import java.util.*;

public class Reto8 {
    public static void main(String[] args) 
    {
        int cantCompetidores;
        float [] tiempo;
        String [] nombres;
        float personaGanadora;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nNATACION");

        System.out.println("\nIngrese la cantidad de competidores");
        cantCompetidores = scanner.nextInt();
        nombres = new String[cantCompetidores];
        tiempo = new float[cantCompetidores];

        for (int i = 0; i < cantCompetidores; i++) 
        {
            System.out.println("Ingrese el nombre del competidor " + (i+1));
            nombres[i] = scanner.next();
            System.out.println("Ingrese el tiempo del competidor");
            tiempo[i] = scanner.nextFloat();
        }

        System.out.println("\n");
        for (int i = 0; i < cantCompetidores; i++) 
        {
            System.out.println(nombres[i] + " tiene un tiempo de: " + tiempo[i]); 
        }
        personaGanadora = tiempo[0];

        for (int i = 0; i < cantCompetidores; i++) 
        {
            if (tiempo[i] < personaGanadora)
            {
                System.out.println("el ganador es: " + nombres[i]);
            }    
        }
        scanner.close();
    }
}
