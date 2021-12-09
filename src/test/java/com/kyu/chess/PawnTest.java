package com.kyu.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PawnTest {

    @Test
    @DisplayName("흰색 폰과 검은색 폰이 생성되어져야 한다")
    void create() {
        Pawn whitePawn = new Pawn("white");
        Pawn blackPawn = new Pawn("black");

        assertThat(whitePawn.getColor()).isEqualTo("white");
        assertThat(blackPawn.getColor()).isEqualTo("black");
    }
}
