package com.mycompany.progra1_prueba4;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        String producto;
        int cantidad=0;
        int numProductos=0;
        int precio=0;
        double costoTotal=0;
        
        System.out.println("Ingrese la cantidad de productos que desea registar: ");
        numProductos=lea.nextInt();
        for (int cont = 1; cont <=numProductos; cont++) {
            System.out.println("Precio del Producto#"+cont+": ");
            precio=lea.nextInt();
            System.out.println("Cantidad de ese producto: ");
            cantidad=lea.nextInt();
            
            costoTotal += precio*cantidad;
        }
        System.out.println("El costo total es de: L."+costoTotal);
        
    }
}
