package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class ForSample {
    Scanner sc =new Scanner(System.in);
    public void sum1to10(){
        int sum = 0;
        for(int i =1; i<=10; i++){
            sum +=i;
        }
        System.out.println("1~10까지 정수들의 합 : " + sum);
    }

    public void sumEven1to100(){
        int sum = 0;
        for(int i = 0;i<=100;i++){
            if(i%2 == 0) sum+=i;
            else continue;
        }
        System.out.println("1부터 100까지의 정수들의 합 : " + sum);
    }

    public void oneGugudan(){
        System.out.print("하나의 정수를 입력하세요 : ");
        int no = sc.nextInt();
        for(int i = 1;i<=9;i++){
            System.out.println(no + "*" + i + "=" + (no*i));
        }
    }

    public void sumMinToMax(){
        int sum = 0;
        System.out.print("첫 번째 정수를 입력하세요.");
        int a = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요.");
        int b = sc.nextInt();

        if(a>b){
            for(int i = b;i<=a;i++){
                sum+=i;
            }
        } else  {
            for(int i = a;i<=b;i++){
                sum+=i;
            }
        }

        System.out.println("정수의 합 :" + sum);
    }
    public void printStar(){
        System.out.print("줄수를 입력하세요 : ");
        int row = sc.nextInt();
        System.out.print("칸수를 입력하세요 : ");
        int calumn = sc.nextInt();

        for(int i = 0;i<row;i++){
            for(int j = 0;j<calumn;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void printNumberStar(){
       for(int i =0;i<7;i++){
           for(int j =0;j<7;j++){
               if(i==j) System.out.print(i);
               else System.out.print("*");
           }
           System.out.println("");
       }

    }

    public void printTriangleStar(){
        System.out.print("줄수를 입력해주세요 : ");
        int a= sc.nextInt();
        if(a>0){
            for(int i = 0;i<a;i++){
                for(int j = 0;j<i+1;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }

    public void guguDan(){
        for(int i = 2;i<=9;i++){
            for(int j = 1;j<=9;j++){
                System.out.println(i + "*" + j + "=" + (i*j));
            }
        }
    }
}
