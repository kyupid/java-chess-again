package com.kyu.chess.piece;

public class Piece {
    private PieceStatus pieceStatus;

    public Piece() {
    }

    public Piece(PieceStatus pieceStatus) {
        this.pieceStatus = pieceStatus;
    }

    public PieceStatus getPieceStatus() {
        return pieceStatus;
    }

    public boolean isWhite(String color) {
        return color.equals("white");
    }

    public boolean isBlack(String color) {
        return color.equals("black");
    }
}
