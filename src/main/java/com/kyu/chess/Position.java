package com.kyu.chess;

public class Position {
    private final String[][] POSITION = new String[8][8];

    public Position() {
        initialize();
    }

    public String[][] getPosition() {
        return POSITION;
    }

    private void initialize() {
        int count = 8;
        char[] alphabet = printAlphabet();
        for (int i = 0; i < POSITION.length; i++) {
            char columnName = alphabet[i];
            for (int j = 0; j < POSITION.length; j++) {
                POSITION[i][j] = String.valueOf(columnName + count);
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
