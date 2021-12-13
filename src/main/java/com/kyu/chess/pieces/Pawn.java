package com.kyu.chess.pieces;

public class Pawn {
    public static final char WHITE_REPRESENTATION = 'p';
    public static final char BLACK_REPRESENTATION = 'P';

    private String color;
    private Character representation;

    public Pawn() {
    }

    public Pawn(String color, Character representation) {
        this.color = color;
        this.representation = representation;
    }

    public String getColor() {
        return color;
    }

    public Character getRepresentation() {
        return representation;
    }
}
