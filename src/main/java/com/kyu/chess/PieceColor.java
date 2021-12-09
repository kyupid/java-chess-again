package com.kyu.chess;

public enum PieceColor {
    WHITE("white"),
    BLACK("black");

    private String color;

    PieceColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
