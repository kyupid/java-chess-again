package com.kyu.chess;

import com.kyu.chess.pieces.Pawn;

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
        final int WHITE_PAWNS_LINE_NUMBER = 1;
        final int BLACK_PAWNS_LINE_NUMBER = 6;
        final String BLANK = ".";

        for (int j = 0; j < map.length; j++) {
            map[i][j] = BLANK;
            if (i == WHITE_PAWNS_LINE_NUMBER) {
                map[i][j] = new Pawn(PieceColor.WHITE.getColor(), Pawn.WHITE_REPRESENTATION).getRepresentation();
            }
            if (i == BLACK_PAWNS_LINE_NUMBER) {
                map[i][j] = new Pawn(PieceColor.BLACK.getColor(), Pawn.BLACK_REPRESENTATION).getRepresentation();
            }
            System.out.print(map[i][j]);
        }
    }

}
