package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class IfSample {
    int no;
    Scanner sc = new Scanner(System.in);


    public void maxNumber(){
        int num1;
        int num2;
        System.out.print("첫 번째 정수를 입력하세요 : ");
        num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        num2 =sc.nextInt();

        if(num1>num2) System.out.println("입력하신 값중 큰 값은 " + num1 + "입니다.");
        else System.out.println("입력하신 값중 큰 값은 " + num2 + "입니다.");
    }

    public void minNumber(){

        int num1;
        int num2;
        System.out.print("첫 번째 정수를 입력하세요 : ");
        num1 = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        num2 =sc.nextInt();

        if(num1<num2) System.out.println("입력하신 값중 작은 값은 " + num1 + "입니다.");
        else System.out.println("입력하신 값중 작은 값은 " + num2 + "입니다.");

    }

    public void threeMaxMin(){
        int[] a =new int[3];

        System.out.print("첫 번째 정수를 입력하세요 : ");
        a[0] = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        a[1] = sc.nextInt();
        System.out.print("세 번째 정수를 입력하세요 : ");
        a[2] = sc.nextInt();

        for(int i = 0; i<a.length-1;i++){
            int check = i;
           for(int j = i+1; j<a.length;j++){
               if(a[check]>a[j]){
                   int temp;
                   temp = a[check];
                   a[check] = a[j];
                   a[j] = temp;
               }
           }
        }
        System.out.println("가장 큰 정수 : " + a[2]);
        System.out.println("가장 작은 정수 : " + a[0]);
    }


    public void checkEven(){
        int no;
        System.out.print("한개의 정수를 입력해 주세요 : ");
        no = sc.nextInt();
        if(no % 2 == 0) System.out.println("입력하신 정수는 짝수입니다. ");
        else System.out.println("입력하신 정수는 혹수입니다. ");

    }

    public void isPassFail(){
        int[] array = new int[3];

        System.out.print("국어 점수를 입력해주세요 : ");
        array[0] = sc.nextInt();
        System.out.print("수학 점수를 입력해주세요 : ");
        array[1] = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        array[2] = sc.nextInt();

        int result = (array[0]+array[1]+array[2])/3;
        if(result >= 60) System.out.println("합격입니다.");
        else System.out.println("불합격입니다.");

    }

    public void scoreGrade() {
        int[] array = new int[5];

        System.out.print("국어 점수를 입력해주세요 : ");
        array[0] = sc.nextInt();
        System.out.print("수학점수를 입력해주세요 : ");
        array[1] = sc.nextInt();
        System.out.print("영어 점수를 입력해주세요 : ");
        array[2] = sc.nextInt();
        System.out.print("과학 점수를 입력해주세요 : ");
        array[3] = sc.nextInt();
        System.out.print("한국사 점수를 입력해주세요 : ");
        array[4] = sc.nextInt();

        int result = (array[0] + array[1] + array[2] + array[3] + array[4]) / array.length;

        if (result >= 90) System.out.println("펑균 학점 : A+");
        else if (result >= 85) System.out.println("평균 학점 : A");
        else if (result >= 80) System.out.println("평균 학점 : B+");
        else if (result >= 75 ) System.out.println("펑균 학점 : B");
        else if (result >= 70) System.out.println("평균 학점 : C");
        else System.out.println("학사경고입니다.");

    }

    public void checkPlusMinusZero(){
        int a;
        a = sc.nextInt();
        if(a>0) System.out.println("입력하신 수는 양수입니다. ");
        else if(a==0) System.out.println("입력하신 수는 0입니다.");
        else System.out.println("입력하신 수는 음수입니다. ");
    }

    public void whatCharacter(){
        String str;
        System.out.print("문자 하나를 입력해주세요 :");
        str = sc.nextLine();
        char ch = str.charAt(0);
        if(ch>=65 && ch<=90) System.out.println("입력하신 문자는 영어 대문자입니다.");
        else if (ch>=97 && ch<=122) System.out.println("입력력하신 문자는 영어 소문자입니다.");
        else if (ch>=48 && ch<=57) System.out.println("입력하신 문자는 숫자입니다.");
        else System.out.println("입력하신 문자는 기타문자입니다.");

    }
}
