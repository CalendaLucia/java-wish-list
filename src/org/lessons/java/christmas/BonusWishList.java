package org.lessons.java.christmas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BonusWishList {
    private final static String FILE_PATH = "./documents/wishlist.txt";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //CREO L ARRAY CHE SARà LA LISTA DEI REGALI
        List <String> wishList = new ArrayList<>();

        //CHIEDERE ALL UTENTE IL NOME DEL REGALO DA INSERIRE FIN QUANDO NON DECIDE DI FERMARSI
        boolean stop = false;

        do {
            System.out.print("Scrivi il nome del regalo: ");
            String nomeRegalo = scanner.nextLine();
            wishList.add(nomeRegalo);

            //AD OGNI ITERAZIONE MOSTRO LA LUNGHEZZA DELLA LISTA
            System.out.println("Nella tua lista ci sono " + wishList.size() + " regali");
            System.out.println("Vuoi continuare ad inserire regali? Si/No");
            String risposta = scanner.nextLine();

            if (risposta.equalsIgnoreCase("no")) {
                stop = true;
                Collections.sort(wishList);//Ordino la lista
                System.out.println("Ecco la tua lista di regali!!");
                for (String regalo : wishList) {
                    System.out.println(regalo.toUpperCase());
                }


                try (FileWriter writer = new FileWriter(FILE_PATH)) {
                    writer.write(wishList.toString());
                    System.out.println("Wishlist salvata in documento");
                } catch (IOException e) {
                    System.out.println("Unable to write to file");
                }

            }
            else if (risposta.isEmpty() || !risposta.equalsIgnoreCase("si")) {
                System.out.println("Valore non valido! Scrivi si o no");
                System.out.println("Vuoi continuare ad inserire regali? Si/No");
                scanner.nextLine();

            }


        } while (!stop);

        scanner.close();
    }
}
