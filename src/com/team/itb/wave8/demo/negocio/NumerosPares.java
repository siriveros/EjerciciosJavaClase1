package com.team.itb.wave8.demo.negocio;

import java.util.Scanner;

public class NumerosPares {

    public static void ingresarDatosNumerosPares(Scanner scanner){
        System.out.println("=================================================");

        int cantidadNumerosPares = 0;

        while(true){
            System.out.println("Ingrese la cantidad de numeros pares que desea ver");
            cantidadNumerosPares = scanner.nextInt();
            if(cantidadNumerosPares> 0){
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }

        System.out.println("=================================================");

        calcularNumerosPares(cantidadNumerosPares);

        System.out.println("=================================================");
    }

    public static void calcularNumerosPares(int cantidadNumerosPares){
        int numerosPares = 0;
        for (int i = 0; numerosPares < cantidadNumerosPares; i++){
            if(i%2 == 0){
                System.out.println(i);
                numerosPares++;
            }
        }
    }
}
