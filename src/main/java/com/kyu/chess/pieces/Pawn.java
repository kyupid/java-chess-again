package com.kyu.chess.pieces;

public class Pawn {
    public static final String WHITE_REPRESENTATION = "p";
    public static final String BLACK_REPRESENTATION = "P";

    private String color;
    private String representation;

    public Pawn() {
    }

    public Pawn(String color, String representation) {
        this.color = color;
        this.representation = representation;
    }

    public String getColor() {
        return color;
    }

    public String getRepresentation() {
        return representation;
    }
}
