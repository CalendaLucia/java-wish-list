package org.lessons.java.ciclabile;

import java.util.NoSuchElementException;

public class IntArray {
   private int[] interi;
    private int indiceCorrente;



    public IntArray(int[] interi){
        this.interi = interi;
        indiceCorrente = 0;
    }

    public int getIndiceCorrente() {
        return indiceCorrente;
    }

    //metodi
    public int getElementoSuccessivo() {
        if (indiceCorrente >= interi.length) {
            throw new NoSuchElementException("Nessun altro elemento presente");
        }
        int elemento = interi[indiceCorrente];
        indiceCorrente++;
        return elemento;
    }

    public boolean hasAncoraElementi() {
        return indiceCorrente < interi.length;
    }

}

