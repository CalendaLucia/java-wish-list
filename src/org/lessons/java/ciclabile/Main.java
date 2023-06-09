package org.lessons.java.ciclabile;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        IntArray intArray = new IntArray(array);
        System.out.println("Primo elemento: " + intArray.getIndiceCorrente());

        while (intArray.hasAncoraElementi()) {
            int elemento = intArray.getElementoSuccessivo();
            System.out.println("Elemento successivo: " + elemento);

            try {
                TimeUnit.SECONDS.sleep(1); //Ritardo di un 1s
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
