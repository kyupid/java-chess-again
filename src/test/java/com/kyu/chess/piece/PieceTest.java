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
        verify(PieceFactory.createWhite(Piece.Type.PAWN), Piece.Color.WHITE, Piece.Type.PAWN);
        verify(PieceFactory.createBlack(Piece.Type.PAWN), Piece.Color.BLACK, Piece.Type.PAWN);
        verify(PieceFactory.createWhite(Piece.Type.KING), Piece.Color.WHITE, Piece.Type.KING);
        verify(PieceFactory.createBlack(Piece.Type.KING), Piece.Color.BLACK, Piece.Type.KING);
        verify(PieceFactory.createWhite(Piece.Type.QUEEN), Piece.Color.WHITE, Piece.Type.QUEEN);
        verify(PieceFactory.createBlack(Piece.Type.QUEEN), Piece.Color.BLACK, Piece.Type.QUEEN);
        verify(PieceFactory.createWhite(Piece.Type.BISHOP), Piece.Color.WHITE, Piece.Type.BISHOP);
        verify(PieceFactory.createBlack(Piece.Type.BISHOP), Piece.Color.BLACK, Piece.Type.BISHOP);
        verify(PieceFactory.createWhite(Piece.Type.KNIGHT), Piece.Color.WHITE, Piece.Type.KNIGHT);
        verify(PieceFactory.createBlack(Piece.Type.KNIGHT), Piece.Color.BLACK, Piece.Type.KNIGHT);
        verify(PieceFactory.createWhite(Piece.Type.ROOK), Piece.Color.WHITE, Piece.Type.ROOK);
        verify(PieceFactory.createBlack(Piece.Type.ROOK), Piece.Color.BLACK, Piece.Type.ROOK);

        verify(PieceFactory.createBlank(), Piece.Color.NO_COLOR, Piece.Type.NO_PIECE);
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
