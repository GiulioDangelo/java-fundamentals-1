package org.experis.treni;

import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("quanti km devi percorrere?");
        int kmDaPercorrere = scan.nextInt();

        System.out.println("quanti anni hai");
        int eta = scan.nextInt();

        double prezzoAlKm = 0.21;
        double prezzo = prezzoAlKm * kmDaPercorrere;

        if (eta <= 20) {
            double prezzoScontato = prezzo - (prezzo * 20 / 100);
            System.out.println(prezzoScontato);
        } else if (eta >= 65 ) {
            double prezzoScontato = prezzo- (prezzo * 40 / 100);
            System.out.println(prezzoScontato);
        } else {
            System.out.println(prezzo);
        }
    }
}
