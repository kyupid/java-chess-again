package com.kyu.chess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("start? y or n");
        while (scanner.next().equals("y")) {
            Board board = new Board();
            board.initialize();
            System.out.println("start? y or n");
            // TODO: 체스말 액션 명령어
        }
        System.exit(1);
    }
}
