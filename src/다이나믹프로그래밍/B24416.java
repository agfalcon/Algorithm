package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24416 {
    private static int recNum = 0;
    private static int dynNum = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fib(n);
        fibonacci(n);
        System.out.println(recNum + " " + dynNum);
    }

    private static int fib(int n){
        if(n==1 || n==2) {
            recNum++;
            return 1;
        }
        else return fib(n-1) + fib(n-2);
    }

    private static int fibonacci(int n){
        if(n==1 || n==2) return 1;
        int[] f = new int[n+1];
        f[1] = 1;
        f[2] = 1;
        for(int i=3;i<=n;i++){
            dynNum++;
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
