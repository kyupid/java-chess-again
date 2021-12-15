package com.kyu.chess;

import com.kyu.chess.pieces.PieceStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BoardTest {
    @Test
    @DisplayName("생성된 폰들을 콘솔로 출력하여 기대한 representation 값이 나오는지 확인한다.")
    void initialize() {
        final int WHITE_PAWNS_LINE_NUMBER = 1;
        final int BLACK_PAWNS_LINE_NUMBER = 6;

        Board board = new Board();
        board.initialize();

        String[][] map = board.getMap();

        for (int i = 0; i < map.length; i++ ) {
            assertThat(map[WHITE_PAWNS_LINE_NUMBER][i]).isEqualTo(PieceStatus.WHITE_PAWN.getRepresentation());
            assertThat(map[BLACK_PAWNS_LINE_NUMBER][i]).isEqualTo(PieceStatus.BLACK_PAWN.getRepresentation());
        }
    }
}
