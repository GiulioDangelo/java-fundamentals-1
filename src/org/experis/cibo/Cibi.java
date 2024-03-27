package org.experis.cibo;

public class Cibi {
    public static void main(String[] args) {
        String[] cibiPreferiti = {"pasta","pizza","patate","riso","carne","sushi","frutta"};

        int lunghezzaArray = cibiPreferiti.length;

        System.out.println(lunghezzaArray); // lunghezza array
        System.out.println(cibiPreferiti[0]); // prima posizione
        System.out.println(cibiPreferiti[lunghezzaArray - 1]); // ultima posizione
        System.out.println(cibiPreferiti[(lunghezzaArray - 1) / 2]); // meta' array
    }
}
