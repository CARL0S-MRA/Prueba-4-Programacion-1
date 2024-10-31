package com.mycompany.progra1_prueba4;
import java.util.Scanner;
public class ServiciosPublicos {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        double consumoMensual=0;
        int consumoTotal=0;
        double promedioMensual=0;
        
        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("Ingrese el consumo de agua para el mes " + mes + ": ");
            consumoMensual=lea.nextDouble();
            
            consumoTotal += consumoMensual;
        }
        promedioMensual= consumoTotal/12;
        
        System.out.println("El consumo total fue de: L "+consumoTotal);
        System.out.println("El pomedio mensual es: "+String.format("%.2f", promedioMensual+"%"));
    }
}
