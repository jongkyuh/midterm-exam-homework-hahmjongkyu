package kr.ac.sahmyook.home.func;
import java.util.Scanner;


public class VariableSample {
    int no;
    Scanner sc =new Scanner(System.in);


    public void myProfile() {
        System.out.println("사원이름 : 함종규");
        System.out.println("사원나이 : 26");


    }

    public void empInformation() {
        int a;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("사원정보를 입력해주세요");

        System.out.print("이름을 입력해주세요 : ");
        str = sc.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        a = sc.nextInt();
        System.out.println("사원이름 : " + str);
        System.out.println("사원나이 : " + a);


    }
}

