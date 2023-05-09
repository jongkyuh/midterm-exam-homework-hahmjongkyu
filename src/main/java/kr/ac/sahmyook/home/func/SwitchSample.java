package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class SwitchSample {
    Scanner sc = new Scanner(System.in);
    public void calculator(){
        System.out.print("첫 번째 정수를 입력하세요 :");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 :");
        int b = sc.nextInt();
        System.out.print("연산기호를 입력하세요 :");
        sc.nextLine();
        String str = sc.nextLine();

        if(str.equals("+")) System.out.println("연산결과 : " + (a+b));
        else if (str.equals("-")) System.out.println("연산결과 : " + (a-b));
        else if (str.equals("*")) System.out.println("연산결과 : " + (a*b));
        else if (str.equals("/")) System.out.println("연산결과 : " + (a/b));
        else if (str.equals("%")) System.out.println("연산결과 : " + (a%b));

    }

    public void fruitPrice(){
        System.out.print("과일이름을 입력해주세요 : ");
        String str = sc.nextLine();

        if(str.equals("바나나")) System.out.println("바나나의 가격은 1000원입니다.");
        else if (str.equals("사과")) System.out.println("사과의 가격은 500원입니다.");
        else if (str.equals("복숭아")) System.out.println("복숭아의 가격은 2000원입니다.");
        else if (str.equals("귤")) System.out.println("사과의 가격은 500원입니다.");
        else System.out.println("목록에 없는 과일입니다.");


    }


}
