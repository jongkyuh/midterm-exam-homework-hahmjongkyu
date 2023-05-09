package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class NonStaticMethodSample {

    Scanner sc = new Scanner(System.in);
    public void testScanner(){
        System.out.print("정수값을 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("실수값을 입력하세요 : ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("문자열값을 입력하세요 : ");
        String c = sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public void testRandom(){

        int a = (int)(Math.random()*100)+1;
        double b = Math.random()*100;
        System.out.println("정수 난수 : " + a);
        System.out.println("실수 난수 : " + b);
    }
}
