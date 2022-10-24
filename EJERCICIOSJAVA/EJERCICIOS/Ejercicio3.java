package EJERCICIOS;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args){
        double estatura1, estatura2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("ESTATURA");
        System.out.println("persona 1, Ingrese la estatura en cm");
        estatura1 = scanner.nextDouble();
        System.out.println("persona 2, Ingrese la estatura en cm");
        estatura2 = scanner.nextDouble();
        
        if (estatura1 > estatura2)
        {
            System.out.println("La persona 1 es mas alto que la persona 2. Con una altura de: " + estatura1);
        }
        else
        {
            System.out.println("La persona 2 es mas alto que la persona 1. Con una altura de: " + estatura2);
        }
        scanner.close();
    }
}
