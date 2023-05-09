package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class DoWhileSample {
    Scanner sc =new Scanner(System.in);
    public void addDashToken(){
        String str = "";
        String check = "";
        do{
            System.out.print("문자열을 입력하세요(종료하려면 0 을 입력해주세요 :");
            check = sc.nextLine();
            if(check.equals("0")) {
                System.out.println(str); break;
            }else str+="-" + check;
        }while(true);
    }

    public void burgerKingMenu(){
        String str = "";
        int money;
        int no=0;
        do {
            System.out.println("1.와퍼 : 6000원");
            System.out.println("2.감자튀김 : 2500원");
            System.out.println("3.콜라 : 2000원");
            System.out.println("4.주문종료");
            System.out.print("선택하실 메뉴의 번호를 눌러주세요");
            no = sc.nextInt();

            switch (no){
                case 1 : str += "와퍼\n"; no +=6000; break;
                case 2 : str += "감자튀김\n"; no +=2500; break;
                case 3 : str += "콜라\n"; no +=2000; break;
                case 4 : str += "총 금액 :" + no + "원";
                    System.out.println(str);
                    return;
            }

        }while(true);
    }

    public void isStringAlphabet(){
        System.out.print("문자열을 입력해주세요: ");
        String str = sc.nextLine();
        int i = 0;
        do{
            if(str.charAt(i)<65 ||(str.charAt(i)>90 && str.charAt(i)<97) || str.charAt(i)>122) {
                System.out.println("영문자 아니다");
                return;
            }
            i++;
        }while(i<str.length());

        System.out.println("모든문자는 영문자이다.");
    }
}
