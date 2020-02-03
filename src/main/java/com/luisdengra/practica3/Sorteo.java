package com.luisdengra.practica3;

import java.util.Arrays;

public class Sorteo {

    public void partidaUnica(Boleto b1){
        int nCoincidencias = 0;
        int[] bomboAuxiliar = new int[6];
        for(int i = 0; i < 6; i++){
            bomboAuxiliar[i] = Lib.aleatorio(0,49);
        }

        Arrays.sort(bomboAuxiliar); //ordenamos el array
        Bombo bombo1 = new Bombo(bomboAuxiliar);
        System.out.println(bombo1.toString());


    }


}
