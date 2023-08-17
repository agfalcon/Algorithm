package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B27433 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        long result = factorial(N);
        System.out.println(result);
    }

    private static long factorial(long N){
        if(N==0) return 1;
        return N * factorial(N-1);
    }
}
