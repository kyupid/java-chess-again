package com.kyu.chess.piece;

public enum PieceStatus {
    WHITE_KING("k", "white"),
    WHITE_QUEEN("q", "white"),
    WHITE_BISHOP("b", "white"),
    WHITE_KNIGHT("n", "white"),
    WHITE_ROOK("r", "white"),
    WHITE_PAWN("p", "white"),

    BLACK_KING("K", "black"),
    BLACK_QUEEN("Q", "black"),
    BLACK_BISHOP("B", "black"),
    BLACK_KNIGHT("N", "black"),
    BLACK_ROOK("R", "black"),
    BLACK_PAWN("P", "black");

    private String representation;
    private String color;

    PieceStatus(String representation, String color) {
        this.representation = representation;
        this.color = color;
    }

    public String getRepresentation() {
        return representation;
    }

    public String getColor() {
        return color;
    }
}
