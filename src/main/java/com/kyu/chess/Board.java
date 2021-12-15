package com.kyu.chess;

import com.kyu.chess.pieces.Piece;
import com.kyu.chess.pieces.PieceStatus;

public class Board {

    private String[][] map = new String[8][8];

    public void initialize() {
        divideRow();
    }

    public void printCurrentBoard() {
        for (String[] strings : map) {
            for (String str : strings) {
                System.out.print(str);
            }
            System.out.println();
        }
    }

    private void divideRow() {
        for (int i = 0; i < map.length; i++) {
            placePawns(i);
            System.out.println();
        }
    }

    private void placePawns(int i) {
        final int WHITE_PIECES_LINE_NUMBER = 0;
        final int WHITE_PAWNS_LINE_NUMBER = 1;
        final int BLACK_PAWNS_LINE_NUMBER = 6;
        final int BLACK_PIECES_LINE_NUMBER = 7;
        final String BLANK = ".";

        for (int j = 0; j < map.length; j++) {
            map[i][j] = BLANK;
            if (i == WHITE_PIECES_LINE_NUMBER) {
                map[i][j] = placeWhitePieces(j);
            }
            if (i == WHITE_PAWNS_LINE_NUMBER) {
                map[i][j] = new Piece(PieceStatus.WHITE_PAWN)
                        .getPieceStatus()
                        .getRepresentation();
            }
            if (i == BLACK_PAWNS_LINE_NUMBER) {
                map[i][j] = new Piece(PieceStatus.BLACK_PAWN)
                        .getPieceStatus()
                        .getRepresentation();
            }
            if (i == BLACK_PIECES_LINE_NUMBER) {
                map[i][j] = placeBlackPieces(j);
            }
            System.out.print(map[i][j]);
        }
    }

    private String placeWhitePieces(int j) {
        switch (j) {
            case 0:
            case 7:
                return new Piece(PieceStatus.WHITE_ROOK).getPieceStatus().getRepresentation();
            case 1:
            case 6:
                return new Piece(PieceStatus.WHITE_KNIGHT).getPieceStatus().getRepresentation();
            case 2:
            case 5:
                return new Piece(PieceStatus.WHITE_BISHOP).getPieceStatus().getRepresentation();
            case 3:
                return new Piece(PieceStatus.WHITE_QUEEN).getPieceStatus().getRepresentation();
            case 4:
                return new Piece(PieceStatus.WHITE_KING).getPieceStatus().getRepresentation();
            default:
                break;
        }
        return new Piece().getPieceStatus().getRepresentation();
    }

    private String placeBlackPieces(int j) {
        switch (j) {
            case 0:
            case 7:
                return new Piece(PieceStatus.BLACK_ROOK).getPieceStatus().getRepresentation();
            case 1:
            case 6:
                return new Piece(PieceStatus.BLACK_KNIGHT).getPieceStatus().getRepresentation();
            case 2:
            case 5:
                return new Piece(PieceStatus.BLACK_BISHOP).getPieceStatus().getRepresentation();
            case 3:
                return new Piece(PieceStatus.BLACK_QUEEN).getPieceStatus().getRepresentation();
            case 4:
                return new Piece(PieceStatus.BLACK_KING).getPieceStatus().getRepresentation();
            default:
                break;
        }
        return new Piece().getPieceStatus().getRepresentation();
    }

    public String[][] getMap() {
        return map;
    }
}
