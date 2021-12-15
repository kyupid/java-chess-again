package com.kyu.chess.pieces;

public class PieceFactory {
    public static Piece createWhitePawn() {
        return new Piece(PieceStatus.WHITE_PAWN);
    }

    public static Piece createBlackPawn() {
        return new Piece(PieceStatus.BLACK_PAWN);
    }

    public static Piece createWhiteKing() {
        return new Piece(PieceStatus.WHITE_KING);
    }

    public static Piece createBlackKing() {
        return new Piece(PieceStatus.BLACK_KING);
    }

    public static Piece createWhiteQueen() {
        return new Piece(PieceStatus.WHITE_QUEEN);
    }

    public static Piece createBlackQueen() {
        return new Piece(PieceStatus.BLACK_QUEEN);
    }

    public static Piece createWhiteBishop() {
        return new Piece(PieceStatus.WHITE_BISHOP);
    }

    public static Piece createBlackBishop() {
        return new Piece(PieceStatus.BLACK_BISHOP);
    }

    public static Piece createWhiteKnight() {
        return new Piece(PieceStatus.WHITE_KNIGHT);
    }

    public static Piece createBlackKnight() {
        return new Piece(PieceStatus.BLACK_KNIGHT);
    }

    public static Piece createWhiteRook() {
        return new Piece(PieceStatus.WHITE_ROOK);
    }

    public static Piece createBlackRook() {
        return new Piece(PieceStatus.BLACK_ROOK);
    }
}
