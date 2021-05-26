package com.team.itb.wave8.demo.negocio;

import java.util.Scanner;

public class Multiplos {

    public static void ingresarDatosMultiplos(Scanner scanner){
        System.out.println("=================================================");

        int cantidadMultiplos = 0;
        int multiplo = 0;

        while(true){
            System.out.println("Ingrese la cantidad de multiplos que desea ver");
            cantidadMultiplos = scanner.nextInt();
            if(cantidadMultiplos> 0){
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }

        while(true){
            System.out.println("Ingrese el multiplo");
            multiplo = scanner.nextInt();
            if(multiplo > 0){
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }

        System.out.println("=================================================");

        calcularCantidadMultiplos(cantidadMultiplos, multiplo);

        System.out.println("=================================================");

    }

    public static void calcularCantidadMultiplos(int cantidadMultiplos, int multiplo){
        int multiplos = 0;
        for (int i = multiplo; multiplos < cantidadMultiplos; i = i + multiplo){
            System.out.println(i);
            multiplos++;
        }
    }
}
