package com.kyu.chess.pieces;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PieceTest {

    @Test
    @DisplayName("Color와 Representation이 null인 기본생성자를 확인한다.")
    void createWithNoColorNoRepresentation() {
        Piece pawn = new Piece();
        verify(pawn, null);
    }

    @Test
    @DisplayName("원하는 Color와 Representation의 폰을 만든다.")
    void createWithStatus() {
        PieceStatus pawnStatus = PieceStatus.WHITE_PAWN;
        Piece pawn = new Piece(pawnStatus);
        verify(pawn, pawnStatus);
    }

    void verify(Piece pawn, PieceStatus pieceStatus) {
        assertThat(pawn.getPieceStatus()).isEqualTo(pieceStatus);
    }
}
