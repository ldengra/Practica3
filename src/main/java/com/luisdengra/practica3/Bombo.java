package com.luisdengra.practica3;

public class Bombo {

    /**
     * Atributos
     */
    private int[] bomboPrincipal; //este bombo tiene que generar 6 numeros mas 1 complementario, array de 7 huecos
    private int bomboReintegro; //generar un numero del 0 al 9.

    /**
     * constructor
     */

    public Bombo(int[] bomboPrincipal, int bomboReintegro) {
        this.bomboPrincipal = bomboPrincipal;
        this.bomboReintegro = bomboReintegro;
    }
}
