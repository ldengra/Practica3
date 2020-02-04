package com.luisdengra.practica3;

public class Bombo {

    /**
     * Atributos
     */
    private int[] bolas; //este bombo tiene que generar 6 numeros mas 1 complementario, array de 6 huecos
    private int contador;
    private int min;
    private int max;

    /**
     * constructor
     */

    public Bombo(final int MIN, final int MAX) {
        int bola = MIN;
        this.min = MIN;
        this.max = MAX;
        contador = 0;
        for(int i = MIN; i <= MAX; i++){
            contador++;
        }
        bolas = new int[contador];
        for(int i = 0; i < bolas.length; i++){
            bolas[i] = bola++;
        }
    }

    public void rellenar(){
        contador = bolas.length -1;
    }

    public int sacarBola(){
        int pos = Lib.aleatorio(min, contador);
        int bola;
        bola = bolas[pos];
        bolas[pos] = bolas[contador-1];
        bolas[--contador] = bola;

        return bola;
    }



}

