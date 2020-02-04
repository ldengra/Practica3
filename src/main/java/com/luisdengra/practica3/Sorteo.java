package com.luisdengra.practica3;

import java.util.Arrays;

public class Sorteo {

    public void partidaUnica(Boleto b1){
        int nCoincidencias;
        Bombo bombo = new Bombo(1,49);
        int[] bolasGanadoras = new int[6];

        for(int i = 0; i < bolasGanadoras.length; i++){
            bolasGanadoras[i] = bombo.sacarBola();
        }

        Arrays.sort(bolasGanadoras);


        System.out.printf("Los numeros del sorteo son:   ");

        for(int i = 0; i<bolasGanadoras.length; i++) {
            System.out.printf(" %-4s", bolasGanadoras[i]);
            }

        System.out.println();
        comprobarApuesta(b1, bolasGanadoras);

    }

    public void comprobarApuesta(Boleto b1, int[] bolasGanadoras){
        int nCoincidencias = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < bolasGanadoras.length; j++){
                if(b1.getBoleto()[i]==bolasGanadoras[j]){
                    nCoincidencias++;
                }
            }
        }


        switch (nCoincidencias){
            case 0:

            case 1:

            case 2:
                System.out.println("Tu boleto no ha sido premiado.");
                break;
            case 3:
                System.out.println("Tu boleto ha sido premiado con el 5º premio!!!!");
                break;

        }
    }

}
