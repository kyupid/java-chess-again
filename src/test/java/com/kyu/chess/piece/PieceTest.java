package com.kyu.chess.piece;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PieceTest {

    @Test
    @DisplayName("원하는 Color와 Representation의 폰을 만든다.")
    void createWithStatus() {
        Piece whitePawn = new Piece(Piece.Color.WHITE, Piece.Type.PAWN);
        verify(whitePawn, Piece.Color.WHITE, Piece.Type.PAWN);
    }

    @Test
    @DisplayName("PieceFactory로 생성한 모든 Piece들에 대해 확인을 한다.")
    void createPieces() {
        verify(PieceFactory.createWhitePawn(), Piece.Color.WHITE, Piece.Type.PAWN);
        verify(PieceFactory.createBlackPawn(), Piece.Color.BLACK, Piece.Type.PAWN);
        verify(PieceFactory.createWhiteKing(), Piece.Color.WHITE, Piece.Type.KING);
        verify(PieceFactory.createBlackKing(), Piece.Color.BLACK, Piece.Type.KING);
        verify(PieceFactory.createWhiteQueen(), Piece.Color.WHITE, Piece.Type.QUEEN);
        verify(PieceFactory.createBlackQueen(), Piece.Color.BLACK, Piece.Type.QUEEN);
        verify(PieceFactory.createWhiteBishop(), Piece.Color.WHITE, Piece.Type.BISHOP);
        verify(PieceFactory.createBlackBishop(), Piece.Color.BLACK, Piece.Type.BISHOP);
        verify(PieceFactory.createWhiteKnight(), Piece.Color.WHITE, Piece.Type.KNIGHT);
        verify(PieceFactory.createBlackKnight(), Piece.Color.BLACK, Piece.Type.KNIGHT);
        verify(PieceFactory.createWhiteRook(), Piece.Color.WHITE, Piece.Type.ROOK);
        verify(PieceFactory.createBlackRook(), Piece.Color.BLACK, Piece.Type.ROOK);
    }

    void verify(Piece pawn, Piece.Color color, Piece.Type type) {
        assertThat(pawn.getColor()).isEqualTo(color);
        assertThat(pawn.getType()).isEqualTo(type);
    }

    @Test
    @DisplayName("검은색말,흰말을 구분하는 메소드를 확인한다.")
    void whiteOrBlack() {
        Piece whitePawn = new Piece(Piece.Color.WHITE, Piece.Type.PAWN);
        Piece blackPawn = new Piece(Piece.Color.BLACK, Piece.Type.PAWN);
        assertThat(whitePawn.isWhite(Piece.Color.WHITE.getColor())).isTrue();
        assertThat(blackPawn.isBlack(Piece.Color.BLACK.getColor())).isTrue();
    }
}
