package kr.ac.sahmyook.home.func;

public class ContinueSample {

    public void sumJumpThree(){
        int sum = 0;
        for(int i = 1;i<=100;i++){
            if(i%3==0)continue;
            sum+=i;
        }
        System.out.println("3의 배수를 뺀 정수들의 합계 : " + sum);
    }

    public void rowColJump(){
        int[][] array = new int[3][5];
        int a = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<5;j++){

                array[i][j]=a+1;
                if((i==1 && j==3) || (i==1 && j==4) || (i==1 && j==5)) continue;
                else System.out.println(array[i][j]);
                a++;

            }
        }
    }
}
