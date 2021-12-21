package com.kyu.chess;

import com.kyu.chess.piece.Piece;

public class Board {

    private Piece[][] map = new Piece[8][8];
    private final String[][] COORDINATE = new Coordinate().getCoordinate();

    public void initialize() {
        divideRow();
        printCurrentBoard();
    }

    public void printCurrentBoard() {
        for (Piece[] pieces : map) {
            for (Piece piece : pieces) {
                printRepresentation(piece);
            }
            System.out.println();
        }
    }

    private void printRepresentation(Piece piece) {
        if (piece.isBlack()) {
            System.out.print(piece.getType().getRepresentation().toUpperCase());
        } else {
            System.out.print(piece.getType().getRepresentation());
        }
    }

    private void divideRow() {
        for (int i = 0; i < map.length; i++) {
            placePawns(i);
        }
    }

    private void placePawns(int i) {
        final int WHITE_PIECES_LINE_NUMBER = 0;
        final int WHITE_PAWNS_LINE_NUMBER = 1;
        final int BLACK_PAWNS_LINE_NUMBER = 6;
        final int BLACK_PIECES_LINE_NUMBER = 7;

        for (int j = 0; j < map.length; j++) {
            map[i][j] = new Piece(Piece.Color.NO_COLOR, Piece.Type.NO_PIECE);
            if (i == WHITE_PIECES_LINE_NUMBER) {
                map[i][j] = placeWhitePieces(j);
            }
            if (i == WHITE_PAWNS_LINE_NUMBER) {
                map[i][j] = new Piece(Piece.Color.WHITE, Piece.Type.PAWN);
            }
            if (i == BLACK_PAWNS_LINE_NUMBER) {
                map[i][j] = new Piece(Piece.Color.BLACK, Piece.Type.PAWN);
            }
            if (i == BLACK_PIECES_LINE_NUMBER) {
                map[i][j] = placeBlackPieces(j);
            }
        }
    }

    private Piece placeWhitePieces(int j) {
        switch (j) {
            case 0:
            case 7:
                return new Piece(Piece.Color.WHITE, Piece.Type.ROOK);
            case 1:
            case 6:
                return new Piece(Piece.Color.WHITE, Piece.Type.KNIGHT);
            case 2:
            case 5:
                return new Piece(Piece.Color.WHITE, Piece.Type.BISHOP);
            case 3:
                return new Piece(Piece.Color.WHITE, Piece.Type.QUEEN);
            case 4:
                return new Piece(Piece.Color.WHITE, Piece.Type.KING);
            default:
                break;
        }
        return new Piece(Piece.Color.NO_COLOR, Piece.Type.NO_PIECE);
    }

    private Piece placeBlackPieces(int j) {
        switch (j) {
            case 0:
            case 7:
                return new Piece(Piece.Color.BLACK, Piece.Type.ROOK);
            case 1:
            case 6:
                return new Piece(Piece.Color.BLACK, Piece.Type.KNIGHT);
            case 2:
            case 5:
                return new Piece(Piece.Color.BLACK, Piece.Type.BISHOP);
            case 3:
                return new Piece(Piece.Color.BLACK, Piece.Type.QUEEN);
            case 4:
                return new Piece(Piece.Color.BLACK, Piece.Type.KING);
            default:
                break;
        }
        return new Piece(Piece.Color.NO_COLOR, Piece.Type.NO_PIECE);
    }

    public Piece[][] getMap() {
        return map;
    }

    public int countOfCertainPiece(Piece[][] map, String representation) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j].isBlack() && map[i][j].getType().getRepresentation().toUpperCase().equals(representation)) {
                    count++;
                }
                if (map[i][j].isWhite() && map[i][j].getType().getRepresentation().equals(representation)) {
                    count++;
                }
            }
        }
        return count;
    }

    public Piece findPiece(String position) {
        int[] mapIndex = findMapIndexBy(position);
        return map[mapIndex[0]][mapIndex[1]];
    }

    private int[] findMapIndexBy(String position) {
        int[] index = new int[2];
        for (int i = 0; i < COORDINATE.length; i++) {
            index = getInts(position, i);
        }
        return index;
    }

    private int[] getInts(String position, int i) {
        for (int j = 0; j < COORDINATE.length; j++) {
            if (COORDINATE[i][j].equals(position)) {
                return new int[]{i, j};
            }
        }
        return null;
    }
}
