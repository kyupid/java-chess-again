package com.kyu.chess;

public class Coordinate {
    private final String[][] COORDINATE = new String[8][8];

    public Coordinate() {
        initialize();
    }

    public String[][] getCoordinate() {
        return COORDINATE;
    }

    private void initialize() {
        int count = 8;
        char[] alphabet = printAlphabet();
        for (int i = 0; i < COORDINATE.length; i++) {
            char columnName = alphabet[i];
            for (int j = 0; j < COORDINATE.length; j++) {
                COORDINATE[i][j] = String.valueOf(columnName + count);
            }
            count--;
        }
    }

    private char[] printAlphabet() {
        char[] alphabet = new char[8];

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        return alphabet;
    }
}
