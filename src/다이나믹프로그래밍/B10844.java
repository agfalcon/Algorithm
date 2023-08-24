package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10844 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = getStepNum(N);
        System.out.println(result);
    }

    private static int getStepNum(int n){
        int[][] steps = new int[n+1][10];
        for(int i=1;i<=9;i++){
            steps[1][i] = 1;
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<=9;j++){
                if(j==0) steps[i][j] = steps[i-1][1];
                else if(j==9) steps[i][j] = steps[i-1][8];
                else steps[i][j] = (steps[i-1][j-1] + steps[i-1][j+1])%1000000000;
            }
        }
        int result = 0;
        for(int i=0;i<10;i++){
            result += steps[n][i];
            result%=1000000000;
        }
        return result;
    }
}
