package com.kyu.chess;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("start? y or n");
        if (!isYesToStartGame()) {
            System.exit(1);
        }
        Board board = new Board();
        board.initialize();
        System.out.println("start? y or n");
        // TODO: 체스말 액션
    }

    private boolean isYesToStartGame() {
        return scanner.next().equals("y");
    }
}
