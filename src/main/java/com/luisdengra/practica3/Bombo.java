package com.luisdengra.practica3;

public class Bombo {

    /**
     * Atributos
     */
    private int[] bomboPrincipal; //este bombo tiene que generar 6 numeros mas 1 complementario, array de 6 huecos
    private final int MAX_PRINCIPAL = 6;
    private int bomboComplementario;
    private int bomboReintegro; //generar un numero del 0 al 9.

    /**
     * constructor
     */

    public Bombo(int[] bomboPrincipal, int bomboReintegro) {
        this.bomboPrincipal = bomboPrincipal;
        this.bomboComplementario = Lib.aleatorio(0,49);
        this.bomboReintegro = Lib.aleatorio(0,9);
    }

    public int getBomboComplementario(){
        return bomboComplementario;
    }

    public int getBomboReintegro() {
        return bomboReintegro;
    }

    @Override
    public String toString() {
        String aux = "";
        aux += String.format("Los numeros premiados son: %24s \n", getBomboString());
        aux += String.format("Y el reintegro es: %3s", bomboReintegro);
        return aux;
    }

    public int[] getBomboPrincipal(){
        return bomboPrincipal;
    }

    public String getBomboString(){
        String aux = "";
        for(int i = 0; i < MAX_PRINCIPAL; i++){
            aux += String.format("%4s", getBomboPrincipal()[i]);
        }
        return aux;
    }
}

