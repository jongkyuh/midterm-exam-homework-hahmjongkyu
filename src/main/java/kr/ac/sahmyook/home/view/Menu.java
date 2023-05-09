package kr.ac.sahmyook.home.view;
import kr.ac.sahmyook.home.func.*;
import java.util.Scanner;
public class Menu {
    int no;
    String str;
    Scanner sc =new Scanner(System.in);
    public void mainMenu(){
        do{
            System.out.println("***** 프로그래밍 기본 기능 테스트 프로그램 *****");
            System.out.println("");
            System.out.println("1. 변수 테스트");
            System.out.println("2. 기본 자료형 테스트");
            System.out.println("3. if문 테스트");
            System.out.println("4. switch문 테스트");
            System.out.println("5. for문 테스트");
            System.out.println("6. while문 테스트");
            System.out.println("7. do~while문 테스트");
            System.out.println("8. break문 테스트");
            System.out.println("9. continue문 테스트");
            System.out.println("10. static 메소드 사용 테스트");
            System.out.println("11. non-static 메소드 사용 테스트");
            System.out.println("12. 프로그램 종료");
            System.out.print("메뉴 번호 입력 : ");
            no = sc.nextInt();
            switch (no){
                case 1 : subVarMenu(); break;
                case 2 : subTypeMenu(); break;
                case 3 : subIfMenu(); break;
                case 4 : subSwitchMenu(); break;
                case 5 : subForMenu(); break;
                case 6 : subWhileMenu();break;
                case 7 : subDoWhileMenu();break;
                case 8 : subBreakMenu(); break;
                case 9 : subContinueMenu(); break;
                case 10 : subStaticMethodMenu(); break;
                case 11 : subNonStaticMethodMenu(); break;
                case 12 :
                    str = sc.nextLine();
                    System.out.print("정말로 종료하시겠습니까? (예 : y / 아니오 : n) : ");
                    str = sc.nextLine();
                    if(str.equals("y") || str.equals("Y") ) System.exit(0);
                    else no = 0;
                default:
                    System.out.println("올바른 번호를 입력해주세요"); no = 0; break;

            }

        }while(no == 0);





    }

    public void subVarMenu(){

        VariableSample vs = new VariableSample();  //1번 클릭 객체
        do {
            System.out.println("*** 변수 테스트 부메뉴 ***");
            System.out.println("");
            System.out.println("1. 내 신상정보 변수에 담아 출력하기 ");
            System.out.println("2. 사원정보를 키보드로 입력받아 출력하기 ");
            System.out.println("3. 이전 메뉴로 가기");
            System.out.print("메뉴선택 : ");
            no =sc.nextInt();
            switch (no){
                case 1 : vs.myProfile(); no = 0; break;
                case 2 : vs.empInformation(); no = 0; break;
                case 3 :
                    System.out.println("메인 메뉴로 돌아갑니다");
                    no = 0;
                    return;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;
            }
        }while(no == 0);
    }

    public void subTypeMenu(){
        PrimitiveTypeSample pts = new PrimitiveTypeSample();    //2버 클릭 객체
        do {
            System.out.println("**** 기본자료형 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. 기본자료형메모리 크기(byte) 출력하기");
            System.out.println("2. 이전 메뉴로 가기");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();
            switch (no) {
                case 1:
                    pts.typeSize();
                    no=0;
                    break;
                case 2:
                    System.out.println("메인 메뉴로 돌아갑니다. ");
                    no = 0;
                    return;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;

            }
        }while(no==0);
    }

    public void subIfMenu(){
        do{
            IfSample is = new IfSample();               //3번 클릭 객체
            System.out.println("*** if문 테스트 부메뉴 ***");
            System.out.println("");
            System.out.println("1. 두 개의 정수를 입력받아, 두 수중 큰 값 출력하기");
            System.out.println("2. 두 개의 정수를 입력받아, 두 수중 작은 값 출력하기");
            System.out.println("3. 세 개의 정수를 입력받아, 세 수중 가장 큰수와 가장 작은수 출력하기");
            System.out.println("4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기");
            System.out.println("5. 국,영,수 세 과목의 점수를 입력받아, 합격/불합격 확인하기");
            System.out.println("6. 점수를 입력받아, 학점 확인하기");
            System.out.println("7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기");
            System.out.println("8. 문자 하나를 입력받아, 영어 대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기");
            System.out.println("9. 이전 메뉴로 가기");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no){
                case 1 : is.maxNumber(); no=0;break;
                case 2 : is.minNumber(); no=0;break;
                case 3 : is.threeMaxMin(); no=0;break;
                case 4 : is.checkEven(); no=0;break;
                case 5 : is.isPassFail(); no=0;break;
                case 6 : is.scoreGrade(); no=0;break;
                case 7 : is.checkPlusMinusZero(); no = 0; break;
                case 8 : is.whatCharacter(); no =0; break;
                case 9 :
                    System.out.println("이전 메뉴로 가기");
                    no = 0;
                    return;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;
            }
        }while(no==0);
    }

    public void subSwitchMenu(){
        SwitchSample ss =new SwitchSample();
        do{
            System.out.println("**** switch문 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. 두개의 정수와 한 개의 연산문자를 입력받아 계산한 결과 확인하기");
            System.out.println("2. 과일이름을 문자열로 입력받아, 그 과일의 가격 출혁력하기");
            System.out.println("3. 이전 메뉴로 가기");
            System.out.print("메뉴 선택 :");
            no = sc.nextInt();

            switch (no){
                case 1 : ss.calculator(); no = 0; break;
                case 2 : ss.fruitPrice(); no = 0; break;
                case 3 :
                    System.out.println("이전 메뉴로 가기");
                    no = 0;
                    return;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;
            }
        }while(no==0);
    }

    public void subForMenu(){
        ForSample fs = new ForSample();
        do{
            System.out.println("**** for문 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. 1~10까지 정수들의 합계 구하기");
            System.out.println("2. 1~100사이의 짝수들의 합계구하기");
            System.out.println("3. 정수 하나 입력받아, 그 수의 구구단 출력하기");
            System.out.println("4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰값까지의 합계 구하기");
            System.out.println("5. 줄수와 칸수 입력받아, 입력된 줄수/칸수 만큼 별표문자 출력하기");
            System.out.println("6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자 출력하기");
            System.out.println("7. 줄 수를 입력받아, 삼각형 모양으로 별표문자 출력하기");
            System.out.println("8. 구구단 2단부터 9단까지 출력하기");
            System.out.println("9. 이전 메뉴로 가기 ");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no){
                case 1 : fs.sum1to10(); no = 0; break;
                case 2 : fs.sumEven1to100(); no = 0; break;
                case 3 : fs.oneGugudan(); no = 0; break;
                case 4: fs.sumMinToMax(); no = 0; break;
                case 5: fs.printStar(); no = 0; break;
                case 6 : fs.printNumberStar(); no = 0; break;
                case 7: fs.printTriangleStar(); no=0; break;
                case 8: fs.guguDan(); no = 0; break;
                case 9:
                    System.out.println("이전 메뉴로 가기");
                    no = 0;
                    return;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;
            }
        }while(no==0);
    }

    public void subWhileMenu(){
        WhileSample ws = new WhileSample();
        do{
            System.out.println("**** while문 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. 문자 하나 입력받아 그 문자의 유니코드 출력 반복('0' 입력되면 반복종료) ");
            System.out.println("2. 1~100까지 정수들의 합계 출력하기(while 문으로 작성)");
            System.out.println("3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기");
            System.out.println("4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기");
            System.out.println("5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇개 있는지 확인하기");
            System.out.println("6. 이전 메뉴로 가기 ");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no){
                case 1 : ws.printUnicode(); no = 0; break;
                case 2 : ws.sumTo100(); no = 0; break;
                case 3 : ws.numberGame(); no = 0; break;
                case 4 : ws.countCharacter(); no = 0; break;
                case 5 : ws.countInChar(); no = 0; break;
                case 6:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    no = 0;
                    return ;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;
            }
        }while(no==0);
    }

    public void subDoWhileMenu(){
        DoWhileSample dw = new DoWhileSample();
        do{
            System.out.println("**** do-while문 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. 문자열값 입력받아, 문자 사이에 '-'끼워넣어 출력하기 ");
            System.out.println("2. 버거킹 메뉴 주문 테스트");
            System.out.println("3. 문자열 입력받아, 모든글자 영문자다/아니다 출력하기");
            System.out.println("4. 이전 메뉴로 가기 ");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no){
                case 1 : dw.addDashToken(); no = 0; break;
                case 2 : dw.burgerKingMenu(); no = 0; break;
                case 3 : dw.isStringAlphabet(); no = 0; break;
                case 4:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    no = 0;
                    return;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;

            }
        }while(no==0);
    }

    public void subBreakMenu(){
        BreakSample bs = new BreakSample();

        do{
            System.out.println("**** break문 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. 1~100까지 정수들의 합계 출력하기 ");
            System.out.println("2 구구단 1단~9단까지 출력하되, *5 계산에서 반복문 빠지기");
            System.out.println("3. 이전 메뉴로 가기 ");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no){
                case 1 : bs.sumBreak(); no = 0; break;
                case 2 : bs.guguDanBreak(); no = 0; break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    no = 0;
                    return ;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;
            }
        }while(no==0);

    }

    public void subContinueMenu(){
        ContinueSample cs = new ContinueSample();
        do{
            System.out.println("**** contunue문 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. 1~100까지 정수중 3의 배수를 뺀 정수들의 합계 출력하기 ");
            System.out.println("2 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기");
            System.out.println("3. 이전 메뉴로 가기 ");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no){
                case 1 : cs.sumJumpThree(); no = 0; break;
                case 2 : cs.rowColJump(); no = 0; break;
                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    no = 0;
                    return ;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;
            }
        }while(no==0);

    }

    public void subStaticMethodMenu(){


        do{
            System.out.println("**** static문 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. 1~45사이의 임의의 정수 출력하기 ");
            System.out.println("2. 절대값 구하기");
            System.out.println("3. 두 정수중 큰 값을 구하기");
            System.out.println("4. 이전 메뉴로 가기 ");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no){
                case 1 : StaticSample.testMathRandom(); no = 0; break;
                case 2 : StaticSample.testMathAbs(); no = 0; break;
                case 3 : StaticSample.testMathMax(); no = 0; break;
                case 4:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    no = 0;
                    return;
                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;
            }
        }while(no==0);

    }

    public void subNonStaticMethodMenu(){
        NonStaticMethodSample ns = new NonStaticMethodSample();


        do{
            System.out.println("**** non - static문 테스트 부메뉴 ****");
            System.out.println("");
            System.out.println("1. Scanner 클래스 사용 ");
            System.out.println("2. Random 클래스 사용");
            System.out.println("3. 이전 메뉴로 가기 ");
            System.out.print("메뉴 선택 : ");
            no = sc.nextInt();

            switch (no){
                case 1 : ns.testScanner(); no = 0; break;
                case 2 : ns.testRandom(); no = 0; break;

                case 3:
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    no = 0;
                    return;

                default:  System.out.println("올바른 번호를 입력해주세요"); no = 0; break;

            }
        }while(no==0);

    }
}
