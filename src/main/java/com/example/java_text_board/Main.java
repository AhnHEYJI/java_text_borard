package com.example.java_text_board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==[텍스트게시판]");
        System.out.println("==게시판을 시작합니다.");
        System.out.print("명령어)");

        String cmd = sc.nextLine();
        System.out.println(String.format("입력받은 명령어: %s", cmd));

        sc.close();

        System.out.println("==게시판을 종료합니다.");
    }
}
