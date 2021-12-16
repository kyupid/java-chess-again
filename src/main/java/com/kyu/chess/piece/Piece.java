package com.kyu.chess.piece;

public class Piece {
    private Color color;
    private Type type;

    public Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public boolean isWhite(String color) {
        return color.equals("white");
    }

    public boolean isBlack(String color) {
        return color.equals("black");
    }

    public enum Color {
        WHITE("white"), BLACK("black"), NO_COLOR("no");

        private String color;

        Color(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }

    public enum Type {
        PAWN("p"), ROOK("r"), KNIGHT("n"), BISHOP("b"), QUEEN("q"), KING("k"), NO_PIECE("no");

        private String representation;

        Type(String representation) {
            this.representation = representation;
        }

        public String getRepresentation() {
            return representation;
        }
    }
}
