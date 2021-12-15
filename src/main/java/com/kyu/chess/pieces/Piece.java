package com.kyu.chess.pieces;

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
}
