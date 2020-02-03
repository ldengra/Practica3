package com.luisdengra.practica3;

public class Sorteo {

    public int[] partidaUnica(){
        int[] bomboAuxiliar = new int[6];
        for(int i = 0; i < 6; i++){
            bomboAuxiliar[i] = Lib.aleatorio(0,49);
        }




        Bombo bombo1 = new Bombo(bomboAuxiliar);
        System.out.println(bombo1.toString());
        return bomboAuxiliar;
    }
}
