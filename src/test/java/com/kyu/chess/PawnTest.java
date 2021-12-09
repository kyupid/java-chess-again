package com.kyu.chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PawnTest {

    @Test
    @DisplayName("원하는 색상으로 폰을 만든다.")
    void create() {
        String color = "white";
        Pawn pawn = new Pawn(color);
        verify(pawn, color);
    }

    void verify(Pawn pawn, String color) {
        assertThat(pawn.getColor()).isEqualTo(color);
    }
}
