package com.kyu.chess.piece;

public class PieceFactory {
    public static Piece createWhitePawn() {
        return new Piece(Piece.Color.WHITE, Piece.Type.PAWN);
    }

    public static Piece createBlackPawn() {
        return new Piece(Piece.Color.BLACK, Piece.Type.PAWN);
    }

    public static Piece createWhiteKing() {
        return new Piece(Piece.Color.WHITE, Piece.Type.KING);
    }

    public static Piece createBlackKing() {
        return new Piece(Piece.Color.BLACK, Piece.Type.KING);
    }

    public static Piece createWhiteQueen() {
        return new Piece(Piece.Color.WHITE, Piece.Type.QUEEN);
    }

    public static Piece createBlackQueen() {
        return new Piece(Piece.Color.BLACK, Piece.Type.QUEEN);
    }

    public static Piece createWhiteBishop() {
        return new Piece(Piece.Color.WHITE, Piece.Type.BISHOP);
    }

    public static Piece createBlackBishop() {
        return new Piece(Piece.Color.BLACK, Piece.Type.BISHOP);
    }

    public static Piece createWhiteKnight() {
        return new Piece(Piece.Color.WHITE, Piece.Type.KNIGHT);
    }

    public static Piece createBlackKnight() {
        return new Piece(Piece.Color.BLACK, Piece.Type.KNIGHT);
    }

    public static Piece createWhiteRook() {
        return new Piece(Piece.Color.WHITE, Piece.Type.ROOK);
    }

    public static Piece createBlackRook() {
        return new Piece(Piece.Color.BLACK, Piece.Type.ROOK);
    }

    public static Piece createBlank() {
        return new Piece(Piece.Color.NO_COLOR, Piece.Type.NO_PIECE);
    }
}
