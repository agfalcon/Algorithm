package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1463 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = getMinOpNum(N);
        System.out.println(result);
    }

    private static int getMinOpNum(int n){
        int[] num = new int[n+1];
        for(int i=2;i<=n;i++){
            if(i%3==0) num[i] = num[i/3]+1;
            if(i%2==0) {
                if(num[i]==0 || num[i]>num[i/2]+1) num[i] = num[i/2] + 1;
            }
            if(num[i]==0 || num[i] > num[i-1]+1) num[i] = num[i-1] + 1;
        }
        return num[n];
    }
}
