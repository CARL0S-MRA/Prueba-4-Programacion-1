package com.mycompany.progra1_prueba4;
import java.util.Scanner;
public class RegistroInventario {
    public static void main(String[] args) {
    Scanner lea=new Scanner(System.in);

        int totalProductos = 0;
        String continuar;
        int cantidad=0;
        do{
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = lea.next();

            System.out.print("Ingrese la cantidad en inventario para " + nombreProducto + ": ");
            cantidad = lea.nextInt();

            totalProductos += cantidad;

            System.out.println("Producto registrado: " + nombreProducto + ", Cantidad en inventario: " + cantidad);

            System.out.print("¿Desea ingresar otro producto? (si/no): ");
            continuar = lea.next().toLowerCase();
        }while (continuar.equals("si"));

        System.out.println("Cantidad total de productos registrados en inventario: " + totalProductos);
    }
}


