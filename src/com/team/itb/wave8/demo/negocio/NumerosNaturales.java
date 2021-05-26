package com.team.itb.wave8.demo.negocio;

import java.util.Scanner;

public class NumerosNaturales {

    public static void ingresarDatosNumerosNumerosNaturales(Scanner scanner ){
        System.out.println("=================================================");

        int cantidadNumerosPares = 0;
        int cantidadDigitos = 0;
        int digito = 0;

        while(true){
            System.out.println("Ingrese la cantidad de numeros naturales que desea ver");
            cantidadNumerosPares = scanner.nextInt();
            if(cantidadNumerosPares > 0){
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }

        while(true){
            System.out.println("Ingrese la cantidad de digitos que desea buscar");
            cantidadDigitos = scanner.nextInt();
            if(cantidadDigitos > 0){
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }

        while(true){
            System.out.println("Ingrese el digito que desea buscar");
            digito = scanner.nextInt();
            if(digito >= 0 && digito < 10){
                break;
            } else {
                System.out.println("Ingrese un numero valido");
            }
        }

        System.out.println("=================================================");

        mostrarNumerosNaturalesNDigitos(cantidadNumerosPares,cantidadDigitos,digito);

        System.out.println("=================================================");

    }

    public static void mostrarNumerosNaturalesNDigitos(int cantidadNumerosNaturales, int cantidadDigitos, int digito){
        int numerosNaturales = 0;
        for (int i = 0; numerosNaturales < cantidadNumerosNaturales; i++){
            if(cumpleCantidadDigitos(i,cantidadDigitos,digito)){
                System.out.println(i);
                numerosNaturales++;
            }
        }
    }

    public static boolean cumpleCantidadDigitos(int numero,int cantidadDigitos, int digito){
        int cantidadDigitosEncontrados = 0;

        String sNumero = String.valueOf(numero);

        String sDigito = String.valueOf(digito);

        for (int i = 0; i < sNumero.length(); i++) {
            if(String.valueOf(sNumero.charAt(i)).equals(sDigito)){
                cantidadDigitosEncontrados++;
            }
        }

        return cantidadDigitosEncontrados == cantidadDigitos;
    }
}
