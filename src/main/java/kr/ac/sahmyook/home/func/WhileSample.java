package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class WhileSample {
    Scanner sc = new Scanner(System.in);
    public void printUnicode(){
        System.out.print("하나의 문자를 입력해주세요.(0 입력시 종료됩니다) : ");
        String str = sc.nextLine();
        char ch = str.charAt(0);
        int a = (int)ch;
        String str2;
        while(true){
            System.out.println(a);
            str2 = sc.nextLine();
            if(str2.equals("0")) break;
        }
    }

    public void sumTo100(){
        int sum = 0;
        int i = 1;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("1부터 100까지 합 : " + sum);
    }

    public void numberGame(){
        int random = (int)(Math.random()*100) + 1;
        System.out.print("1~100사이의 정수를 입력해주세요 : ");
        int num = sc.nextInt();
        while(true){
            if(random>num) System.out.println("입력하신 수가 작습니다.");
            else if(random<num) System.out.println("입력하신 수가 큽니다");
            else {
                System.out.println("정답입니다!");
                break;

            }
            System.out.print("1~100사이의 정수를 입력해주세요 : ");
            num = sc.nextInt();
        }
    }

    public void countCharacter(){
        int count=0;
        int i = 0;
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();
        while(i<str.length()){
            count++;
            i++;
        }
        System.out.println("문자열의 길이는 " + count + "입니다");
    }

    public void countInChar(){
        int count = 0;
        int i = 0;
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.nextLine();
        System.out.print("하나의 문자를 입력해주세요  : ");
        String str2 = sc.nextLine();

        while(i<str1.length()){
            if(str1.charAt(i)==str2.charAt(0)) count++;
            i++;
        }

        System.out.println("입력하신 " + str1 + "문자열 안에 " + str2 + "는 " + count + "개 포함되어 있습니다.");
    }
}
