package com.kyu.chess;

import com.kyu.chess.pieces.Pawn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BoardTest {
    @Test
    @DisplayName("하얀색,검은색 폰을 생성해서 보드에 추가한뒤 잘들어간지 확인한다.")
    void create() {
        Board board = new Board();

        Pawn whitePawn = new Pawn(PieceColor.WHITE.getColor(), Pawn.WHITE_REPRESENTATION);
        board.addPawn(whitePawn);
        assertThat(board.size()).isEqualTo(1);
        assertThat(board.findPawn(0)).isEqualTo(whitePawn);

        Pawn blackPawn = new Pawn(PieceColor.BLACK.getColor(), Pawn.BLACK_REPRESENTATION);
        board.addPawn(blackPawn);
        assertThat(board.size()).isEqualTo(2);
        assertThat(board.findPawn(1)).isEqualTo(blackPawn);
    }
}
