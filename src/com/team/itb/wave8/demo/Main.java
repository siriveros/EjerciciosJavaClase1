package com.team.itb.wave8.demo;

import com.team.itb.wave8.demo.negocio.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionSeleccionada = 0;

        while(true){
            System.out.println("Seleccione Ejercicio: ");
            System.out.println("    - 1: Numeros Pares");
            System.out.println("    - 2: Multiplos");
            System.out.println("    - 3: Verificar si el Numero es Primo");
            System.out.println("    - 4: Numeros Primos");
            System.out.println("    - 5: Numeros Naturales");
            System.out.println("    - 6: Salir");

            opcionSeleccionada = scanner.nextInt();

            if(opcionSeleccionada == 1){
                NumerosPares.ingresarDatosNumerosPares(scanner);
            }
            if(opcionSeleccionada == 2){
                Multiplos.ingresarDatosMultiplos(scanner);
            }
            if(opcionSeleccionada == 3){
                Primos.verificarNumeroPrimo(scanner);
            }
            if(opcionSeleccionada == 4){
                Primos.mostrarNumerosPrimos(scanner);
            }
            if(opcionSeleccionada == 5){
                NumerosNaturales.ingresarDatosNumerosNumerosNaturales(scanner);
            }
            if(opcionSeleccionada == 6){
                break;
            }
            if(opcionSeleccionada > 6){
                System.out.println("La opcion seleccionada no es correcta");
            }
        }
        scanner.close();
    }
}
