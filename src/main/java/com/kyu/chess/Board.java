package com.kyu.chess;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Pawn> pawns = new ArrayList<>();

    public void addPawn(Pawn pawn) {
        pawns.add(pawn);
    }
}
