package kr.ac.sahmyook.home.func;

public class StaticSample {

    public static void testMathRandom(){
        int a = (int)(Math.random()*45)+1;
        System.out.println("1~45사이의 임의의 정수 :" + a);
    }

    public static void testMathAbs(){
        double a = -12.77;
        System.out.println("-12.77의 절대값 : " + Math.abs(a));
    }

    public static void testMathMax(){
        int a = 120;
        int b = 54;

        if(a>b) System.out.println("두 정수 중 큰 값은" + a + "입니다");
        else System.out.println("두 정수 중 큰 값은" + b + "입니다.");
    }

}
