package RETOS;
import java.util.*;

public class Reto5 {
    public static void main(String[] args) 
    {
        double precio,total = 0;
        int cantProducto, eleccion;

        Scanner scanner = new Scanner(System.in);

        System.out.println("TIENDA");

        do
        {
            System.out.println("Ingrese la cantidad de productos a comprar");
            cantProducto = scanner.nextInt();

            System.out.println("Ingrese el precio del producto");

            for(int i = 1; i <= cantProducto; i++)
            {
                
                System.out.print(i + ". ");
                precio = scanner.nextDouble();
                total = total + precio;
            }
            System.out.println("El total de la compra es: " + total);

            System.out.println("Ingrese (0) si quiere agregar otro producto. Ingrese (otro numero) si quiere finalizar la compra");
            eleccion = scanner.nextInt();

        }while(eleccion == 0);
        System.out.println("Gracias por su compra");
        scanner.close();
    }
}