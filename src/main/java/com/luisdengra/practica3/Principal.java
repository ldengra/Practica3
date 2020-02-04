package com.luisdengra.practica3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    private static Scanner input;
    Sorteo sorteo = new Sorteo();
    public Principal() {


        input = new Scanner(System.in);
        int opcion;

        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    juegoUnico();
                    break;
                case 2:
                    //hastaObtenerPremio();
                    break;
                case 3:
                    //hastaObtenerPremioCR();
                    break;
                case 4:
                    //cicloMilSorteos();
                    break;
                case 5:
                    //hastaCategoriaEspecial();

                case 0:
                    System.out.println("Hasta pronto!");
                    break;
            }
        } while (opcion != 0);

        input.close();

    }

    public int menuPrincipal() {
        int opcion = -1;
        do {
            Lib.limpiarPantalla();
            System.out.println("*********************");
            System.out.println("**    PRIMITIVA    **");
            System.out.println("*********************");
            System.out.println("1. Juego unico.");
            System.out.println("2. Jugar hasta obtener premio.");
            System.out.println("3. Jugar hasta obtener premio (Sin reintegro).");
            System.out.println("4. Ciclo de 10000 sorteos.");
            System.out.println("5. Jugar hsata ganar la categoria especial.");
            System.out.println("---------------------");
            System.out.println("0. Salir\n");
            System.out.println("Elija una opción: ");
            opcion = Integer.parseInt(input.nextLine());
            if (opcion < 0 || opcion > 5) {
                System.out.println("Elija una opción del menú [0-5]");
                Lib.pausa();
            }

        } while (opcion < 0 || opcion > 5);
        return opcion;
    }

    public void juegoUnico(){
        int opcion = -1;
        do {
            System.out.println("***JUEGO UNICO***");
            System.out.println("1. Generar boleto manualmente.");
            System.out.println("2. Generar boleto automaticamente");
            System.out.println("----------------------------------");
            System.out.println("0. Salir\n");
            System.out.println("Elija una opción");
            opcion = Integer.parseInt(input.nextLine());
            if (opcion < 0 || opcion > 5) {
                System.out.println("Elija una opción del menú [0-2]");
                Lib.pausa();
            }
        } while (opcion < 0 || opcion > 2);

        switch (opcion){
            case 1:
                sorteo.partidaUnica(rellenarManual());
                break;
            case 2:
                sorteo.partidaUnica(rellenarAutomatico());
                break;

            case 0:
                System.out.println("Hasta pronto!");
                break;
        }
    }





    public Boleto rellenarManual(){

        int[] boletoAux = new int[6];
        int numero;
        boolean validado = false;

        do {
            System.out.println("Inserta el primer numero:");
            numero = input.nextInt();
            input.nextLine();
            if(numero>=0 && numero<=49) {
                boletoAux[0] = numero;
                validado=true;
            }else {
                System.out.println("El numero introducido no esta comprendido entre el 0 y el 49, inserte un numero valido.");
            }
        }while (!validado);

        do {
            validado = false;
            System.out.println("Inserta el segundo numero:");
            numero = input.nextInt();
            input.nextLine();

            if(busquedaLineal(boletoAux, numero) || !validarNumero(numero)){
                System.out.println("el numero que has introducido ya esta en el boleto o no esta comprendido entre el 0 y el 49. Inserta otro diferente.");
            }else{
                boletoAux[1] = numero;
                validado = true;
            }
        }while (!validado);
        do {
            validado = false;
            System.out.println("Inserta el tercer numero:");
            numero = input.nextInt();
            input.nextLine();

            if(busquedaLineal(boletoAux, numero) || !validarNumero(numero)){
                System.out.println("el numero que has introducido ya esta en el boleto o no esta comprendido entre el 0 y el 49. Inserta otro diferente.");
            }else{
                boletoAux[2] = numero;
                validado = true;
            }
        }while (!validado);
        do {
            validado = false;
            System.out.println("Inserta el cuarto numero:");
            numero = input.nextInt();
            input.nextLine();

            if(busquedaLineal(boletoAux, numero) || !validarNumero(numero)){
                System.out.println("el numero que has introducido ya esta en el boleto o no esta comprendido entre el 0 y el 49. Inserta otro diferente.");
            }else{
                boletoAux[3] = numero;
                validado = true;
            }
        }while (!validado);
        do {
            validado = false;
            System.out.println("Inserta el quinto numero:");
            numero = input.nextInt();
            input.nextLine();

            if(busquedaLineal(boletoAux, numero) || !validarNumero(numero)){
                System.out.println("el numero que has introducido ya esta en el boleto o no esta comprendido entre el 0 y el 49. Inserta otro diferente.");
            }else{
                boletoAux[4] = numero;
                validado = true;
            }
        }while (!validado);
        do {
            validado = false;
            System.out.println("Inserta el sexto numero:");
            numero = input.nextInt();
            input.nextLine();

            if(busquedaLineal(boletoAux, numero) || !validarNumero(numero)){
                System.out.println("el numero que has introducido ya esta en el boleto o no esta comprendido entre el 0 y el 49. Inserta otro diferente.");
            }else{
                boletoAux[5] = numero;
                validado = true;
            }
        }while (!validado);
        Arrays.sort(boletoAux);
        Boleto b1 = new Boleto(boletoAux);

        System.out.println(b1.toString());

        return b1;
    }

    static boolean busquedaLineal(int[] array, int dato) {
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == dato) {
                return true;
            }
        }
        return false;
    }

    static boolean validarNumero(int numero){
        if(numero>=0 && numero<=49){
            return true;
        }
        return false;
    }

    public Boleto rellenarAutomatico(){
        int[] boletoAux = new int[6];

        for(int i = 0; i < 6; i++){
            boletoAux[i]=Lib.aleatorio(0,49);
        }
        Arrays.sort(boletoAux);
        Boleto boletoAutomatico = new Boleto(boletoAux);
        System.out.println(boletoAutomatico.toString());
        return boletoAutomatico;
    }


}
