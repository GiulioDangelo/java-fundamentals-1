package org.experis.bonus;

import java.util.Scanner;

public class ListaFesta {
    public static void main(String[] args) {

        String[] listaInvitati = {
            "Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax",
            "Francesco Totti","Ilary Blasi","Bebe Vio","Luis",
            "Pardis Zarei","Martina Maccherone","Rachel Zeilic"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome completo: ");
        String nomeUtente = scanner.nextLine();

        boolean presente = false;
        for (int i = 0; i < listaInvitati.length; i++) {
            if (listaInvitati[i].equalsIgnoreCase(nomeUtente)) {
                presente = true;
                break;
            }
        }

        if (presente) {
            System.out.println("accesso consentito");
        } else {
            System.out.println("accesso negato");
        }

        scanner.close();
    }
}
