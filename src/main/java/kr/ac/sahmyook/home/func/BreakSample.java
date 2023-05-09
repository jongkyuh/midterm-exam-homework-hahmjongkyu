package kr.ac.sahmyook.home.func;

public class BreakSample {

    public void sumBreak(){
        int sum = 0;
        int i = 1;
        while(true){
            sum+=i;
            i++;
            if(i>100) break;
        }
        System.out.println("1~100까지의 정수들의 합 :" + sum);
    }

    public void guguDanBreak(){
            for(int i = 2;i<=9;i++){
                for(int j = 1;j<=9;j++){
                    System.out.println(i + "*" + j + "=" + (i*j));
                    if(j==5) break;
                }
            }
    }


}
