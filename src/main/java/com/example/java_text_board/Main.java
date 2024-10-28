package com.example.java_text_board;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==[텍스트게시판]");
        System.out.println("==게시판을 시작합니다.");

        int id = 1; // 게시물 id 초기화. 반복문 외부에 위치해야 매번 1로 초기화되지 않음

        while (true) {
            System.out.print("명령어) ");
            String cmd = sc.nextLine();

            if (cmd.equals("/usr/article/write")) {
                System.out.print("제목: ");
                String subject = sc.nextLine();

                System.out.print("내용: ");
                String content = sc.nextLine();

                // 새로운 Article 객체 생성 후 속성 설정
                Article article = new Article();
                article.id = id;
                article.subject = subject;
                article.content = content;

                System.out.printf("%d번 게시물이 등록되었습니다\n", id);
                System.out.println("등록된 게시물 객체: " + article);

                id++; // 게시물 id 증가
            } else if (cmd.equals("exit")) {
                System.out.println("==게시판을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력어 입니다. 다시 입력해주세요");
            }
        }
        sc.close();
    }

    // Article 클래스는 static 중첩 클래스로 변경하여 main 메서드에서 접근 가능하도록 합니다.
    static class Article {
        int id;
        String subject;
        String content;
    }
}
