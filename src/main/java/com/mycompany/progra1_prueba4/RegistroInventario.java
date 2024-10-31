package com.mycompany.progra1_prueba4;
import java.util.Scanner;
public class RegistroInventario {
    Scanner lea=new Scanner(System.in);

        int totalProductos = 0;
        String continuar;

        do{
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = lea.next();

            System.out.print("Ingrese la cantidad en inventario para " + nombreProducto + ": ");
            int cantidad = lea.nextInt();

            // Incrementa el total de productos registrados
            totalProductos += cantidad;

            // Mostrar el producto y su inventario registrado
            System.out.println("Producto registrado: " + nombreProducto + ", Cantidad en inventario: " + cantidad);

            System.out.print("¿Desea ingresar otro producto? (si/no): ");
            continuar = lea.next();

        }while (continuar.equalsIgnoreCase("si"));

        System.out.println("Cantidad total de productos registrados en inventario: " + totalProductos);
    }
}

}
