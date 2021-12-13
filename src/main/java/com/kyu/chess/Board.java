package com.kyu.chess;

import com.kyu.chess.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Pawn> pawns = new ArrayList<>();
    private final String blank = ".";
    private String[][] map = new String[8][8];

    public void addPawn(Pawn pawn) {
        pawns.add(pawn);
    }

    public int size() {
        return pawns.size();
    }

    public Pawn findPawn(int index) {
        return pawns.get(index);
    }

    public void initialize() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = blank;
                if (i == 1) {
                    map[i][j] = new Pawn(PieceColor.WHITE.getColor(), Pawn.WHITE_REPRESENTATION).getRepresentation();
                }
                if (i == 6) {
                    map[i][j] = new Pawn(PieceColor.BLACK.getColor(), Pawn.BLACK_REPRESENTATION).getRepresentation();
                }
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public void printCurrentBoard() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

}
