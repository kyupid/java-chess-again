package com.kyu.chess.pieces;

public class Pawn {
    private final char WHITE_REPRESENTATION = 'p';
    private final char BLACK_REPRESENTATION = 'P';

    private String color;

    public Pawn() {
    }

    public Pawn(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
