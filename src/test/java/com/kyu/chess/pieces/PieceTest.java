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

    @Test
    @DisplayName("PieceFactory로 생성한 모든 Piece들에 대해 확인을 한다.")
    public void create_piece() {
        verify(PieceFactory.createWhitePawn(), PieceStatus.WHITE_PAWN);
        verify(PieceFactory.createBlackPawn(), PieceStatus.BLACK_PAWN);
        verify(PieceFactory.createWhiteKing(), PieceStatus.WHITE_KING);
        verify(PieceFactory.createBlackKing(), PieceStatus.BLACK_KING);
        verify(PieceFactory.createWhiteQueen(), PieceStatus.WHITE_QUEEN);
        verify(PieceFactory.createBlackQueen(), PieceStatus.BLACK_QUEEN);
        verify(PieceFactory.createWhiteBishop(), PieceStatus.WHITE_BISHOP);
        verify(PieceFactory.createBlackBishop(), PieceStatus.BLACK_BISHOP);
        verify(PieceFactory.createWhiteKnight(), PieceStatus.WHITE_KNIGHT);
        verify(PieceFactory.createBlackKnight(), PieceStatus.BLACK_KNIGHT);
        verify(PieceFactory.createWhiteRook(), PieceStatus.WHITE_ROOK);
        verify(PieceFactory.createBlackRook(), PieceStatus.BLACK_ROOK);
    }

    void verify(Piece pawn, PieceStatus pieceStatus) {
        assertThat(pawn.getPieceStatus()).isEqualTo(pieceStatus);
    }
}
