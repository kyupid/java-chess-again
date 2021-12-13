package com.kyu.chess.pieces;

import com.kyu.chess.PieceColor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PawnTest {

    @Test
    @DisplayName("Color와 Representation이 null인 기본생성자를 확인한다.")
    void createWithNoColorNoRepresentation() {
        Pawn pawn = new Pawn();
        verify(pawn, pawn.getColor(), null);
    }

    @Test
    @DisplayName("원하는 색상으로 폰을 만든다.")
    void createWithColor() {
        String color = PieceColor.WHITE.getColor();
        String representation = Pawn.WHITE_REPRESENTATION;
        Pawn pawn = new Pawn(color, representation);
        verify(pawn, color, representation);
    }

    void verify(Pawn pawn, String color, String representation) {
        assertThat(pawn.getColor()).isEqualTo(color);
        assertThat(pawn.getRepresentation()).isEqualTo(representation);
    }
}
