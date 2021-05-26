package com.team.itb.wave8.demo.negocio;

import java.util.Scanner;

public class Primos {

    public static void verificarNumeroPrimo(Scanner scanner){
        System.out.println("=================================================");

        int numeroIngresado = 0;

        while(true){
            System.out.println("Ingrese el numero para verificar");
            numeroIngresado = scanner.nextInt();
            if(numeroIngresado> 1){
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }

        System.out.println("=================================================");

        System.out.println(esPrimo(numeroIngresado)?"Es Primo":"No es primo");

        System.out.println("=================================================");

    }
    public static void mostrarNumerosPrimos(Scanner scanner ){
        System.out.println("=================================================");

        int cantidadNumerosPrimos = 0;

        while(true){
            System.out.println("Ingrese la cantidad de numeros primos que desea ver");
            cantidadNumerosPrimos = scanner.nextInt();
            if(cantidadNumerosPrimos> 1){
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }

        System.out.println("=================================================");

        mostrarPrimos(cantidadNumerosPrimos);

        System.out.println("=================================================");

    }

    public static void mostrarPrimos(int cantidadNumerosPrimos){
        int numerosPrimos = 0;
        for (int i = 2; numerosPrimos < cantidadNumerosPrimos; i++){
            if(Primos.esPrimo(i)){
                System.out.println(i);
                numerosPrimos++;
            }
        }
    }

    public static boolean esPrimo(int numero){
        for (int i = 2; i < numero; i++) {
            if(numero%i == 0){
                return false;
            }
        }
        return true;
    }
}
