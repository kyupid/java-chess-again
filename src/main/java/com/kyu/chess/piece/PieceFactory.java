package com.kyu.chess.piece;

public class PieceFactory {
    public static Piece createWhite(Piece.Type type) {
        return new Piece(Piece.Color.WHITE, type);
    }

    public static Piece createBlack(Piece.Type type) {
        return new Piece(Piece.Color.BLACK, type);
    }

    public static Piece createBlank() {
        return new Piece(Piece.Color.NO_COLOR, Piece.Type.NO_PIECE);
    }
}
