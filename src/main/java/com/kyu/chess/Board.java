package com.kyu.chess;

import com.kyu.chess.pieces.Pawn;

public class Board {
    private final String blank = ".";
    private String[][] map = new String[8][8];

    public void initialize() {
        final int WHITE_PAWNS_LINE_NUMBER = 1;
        final int BLACK_PAWNS_LINE_NUMBER = 6;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = blank;
                if (i == WHITE_PAWNS_LINE_NUMBER) {
                    map[i][j] = new Pawn(PieceColor.WHITE.getColor(), Pawn.WHITE_REPRESENTATION).getRepresentation();
                }
                if (i == BLACK_PAWNS_LINE_NUMBER) {
                    map[i][j] = new Pawn(PieceColor.BLACK.getColor(), Pawn.BLACK_REPRESENTATION).getRepresentation();
                }
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public void printCurrentBoard() {
        for (String[] pieces : map) {
            for (String piece : pieces) {
                System.out.print(piece);
            }
            System.out.println();
        }
    }

    public String[][] getMap() {
        return map;
    }
}
