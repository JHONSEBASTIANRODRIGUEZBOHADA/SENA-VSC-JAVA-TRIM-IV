package EJERCICIOS;
import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) 
    {
        int opciones = 0, eleccion = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("QUIEN QUIERE SER MILLONARIO");

        if( opciones == 0)
            {
                System.out.println("(1.)¿?");
                System.out.println("1. ---");
                System.out.println("2. ---");
                System.out.println("3. ---");
                opciones = scanner.nextInt();

                if(opciones == 1)
                {
                    System.out.println("CORRECTO");
                    System.out.println("\n(2.)¿?");
                    System.out.println("1. ---");
                    System.out.println("2. ---");
                    System.out.println("3. ---");
                    opciones = scanner.nextInt();

                    if(opciones == 3)
                    {
                        System.out.println("CORRECTO");
                        System.out.println("\n(3.)¿?");
                        System.out.println("1. ---");
                        System.out.println("2. ---");
                        System.out.println("3. ---");
                        opciones = scanner.nextInt();

                        if(opciones == 1)
                        {
                            System.out.println("CORRECTO");
                            System.out.println("\n(4.)¿?");
                            System.out.println("1. ---");
                            System.out.println("2. ---");
                            System.out.println("3. ---");
                            opciones = scanner.nextInt();

                            if(opciones == 2)
                            {
                                System.out.println("CORRECTO");
                                System.out.println("\n(5.)¿?");
                                System.out.println("1. ---");
                                System.out.println("2. ---");
                                System.out.println("3. ---");
                                opciones = scanner.nextInt();

                                if(opciones == 3)
                                {
                                    System.out.println("CORRECTO");
                                    System.out.println("FINALIZO EL JUEGO");

                                }else{System.out.println("INCORRECTO");}

                            }else{System.out.println("INCORRECTO");}

                        }else{System.out.println("INCORRECTO");}

                    }else{System.out.println("INCORRECTO");}

                }else{System.out.println("INCORRECTO");}
                
            }else{System.out.println("INCORRECTO");}

























        

        




        scanner.close();

    }
}
