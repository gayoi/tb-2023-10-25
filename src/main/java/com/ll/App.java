package com.ll;

import java.util.Scanner;

class App {
    void run() {
        while (true){
            System.out.println("=== 명언 앱 ===");

            System.out.print("명령) ");

            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine(); //한줄이 입력될때까지 멈춘다

            if(cmd.equals("종료")) { //string 비교할떄 == 아니라 000.equals이다! 외워라
                break; // cotinue 이번 텀만 쉬는것 break 반복문 자체가 끝나는것!!
            }
            System.out.printf("입력하신 명령 : %s\n", cmd);
            // 위 라인은 아래 라인과 같은 뜻 cmd안에 값이 %s로 치환이 되서 문장이 완성
            //System.out.printf("입력하신 명령 : %s\n");
        }

    }
}
