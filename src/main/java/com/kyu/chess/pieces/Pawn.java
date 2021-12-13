package com.kyu.chess.pieces;

public class Pawn {
    public static final char WHITE_REPRESENTATION = 'p';
    public static final char BLACK_REPRESENTATION = 'P';

    private String color;
    private char representation;

    public Pawn() {
    }

    public Pawn(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public char getRepresentation() {
        return representation;
    }
}
