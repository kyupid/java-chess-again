package com.kyu.chess;

import com.kyu.chess.piece.Piece;
import com.kyu.chess.piece.PieceFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BoardTest {
    @Test
    @DisplayName("생성된 체스말들을 콘솔로 출력하여 기대한 representation 값이 나오는지 확인한다.")
    void initialize() {
        final int WHITE_PIECES_LINE_NUMBER = 0;
        final int WHITE_PAWNS_LINE_NUMBER = 1;
        final int BLACK_PAWNS_LINE_NUMBER = 6;
        final int BLACK_PIECES_LINE_NUMBER = 7;
        final String WHITE_PIECES_REPRESENTATION = "rnbqkbnr";
        final String BLACK_PIECES_REPRESENTATION = "RNBQKBNR";

        Board board = new Board();
        board.initialize();

        String[][] map = board.getMap();

        StringBuilder whitePiecesRepresentation = new StringBuilder();
        StringBuilder blackPiecesRepresentation = new StringBuilder();
        for (int i = 0; i < map.length; i++) {
            whitePiecesRepresentation.append(map[WHITE_PIECES_LINE_NUMBER][i]);
            blackPiecesRepresentation.append(map[BLACK_PIECES_LINE_NUMBER][i]);
            assertThat(map[WHITE_PAWNS_LINE_NUMBER][i]).isEqualTo(Piece.Type.PAWN.getRepresentation());
            assertThat(map[BLACK_PAWNS_LINE_NUMBER][i]).isEqualTo(Piece.Type.PAWN.getRepresentation().toUpperCase());
        }
        assertThat(whitePiecesRepresentation.toString()).isEqualTo(WHITE_PIECES_REPRESENTATION);
        assertThat(blackPiecesRepresentation.toString()).isEqualTo(BLACK_PIECES_REPRESENTATION);
    }

    @Test
    @DisplayName("초기화된 보드의 검정색 폰의 갯수를 정확히 반환하는지 확인한다.")
    void countBlackPawns() {
        Board board = new Board();
        board.initialize();

        String blackPawnRepresentation = new Piece(Piece.Color.BLACK, Piece.Type.PAWN).getType().getRepresentation();
        int countOfBlackPawns = board.countOfCertainPiece(board.getMap(), blackPawnRepresentation);

        assertThat(countOfBlackPawns).isEqualTo(8);
    }

    @Test
    @DisplayName("특정 위치의 체스말을 반환하는 것을 확인한다.")
    void findPiece() {
        Board board = new Board();
        board.initialize();

        assertThat(board.findPiece("a8")).isEqualTo(PieceFactory.createWhite(Piece.Type.ROOK));
        assertThat(board.findPiece("h8")).isEqualTo(PieceFactory.createWhite(Piece.Type.ROOK));
        assertThat(board.findPiece("a1")).isEqualTo(PieceFactory.createBlack(Piece.Type.ROOK));
        assertThat(board.findPiece("h1")).isEqualTo(PieceFactory.createBlack(Piece.Type.ROOK));
    }
}
