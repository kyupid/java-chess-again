package com.kyu.chess;

import com.kyu.chess.pieces.Pawn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BoardTest {
    @Test
    @DisplayName("생성된 폰들을 콘솔로 출력하여 의도된 모양인지 확인한다.")
    void initialize() {
        Board board = new Board();
        board.initialize();
    }
}
