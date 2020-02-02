package com.luisdengra.practica3;


import java.util.Arrays;

public class Boleto {

    /**
     * Atributos
     */
    private int[] boleto;
    private final int MAX_NUMS = 6;
    private int reintegro;

    /**
     * Constructor
     */
    public Boleto(int[] boleto) {
        this.boleto = boleto;
        this.reintegro = Lib.aleatorio(0,9);
    }

    /**
     * metodos
     */
    @Override
    public String toString() {
        String aux = "";
        aux += String.format("Los numeros de tu boleto son: %-24s \n", getBoletoString());
        aux += String.format("Reintegro: %3s", reintegro);
        return aux;
    }

    public int[] getBoleto(){
        return boleto;
    }

    public String getBoletoString(){
        String aux = "";
        for(int i = 0; i < MAX_NUMS; i++){
            aux += String.format("%4s", getBoleto()[i]);
        }
        return aux;
    }
}
