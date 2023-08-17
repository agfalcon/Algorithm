package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = fibo(n);
        System.out.println(result);
    }

    private static int fibo(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        return fibo(n-2) + fibo(n-1);
    }
}
