package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9461 {

    private static long[] lengths = new long[101];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        lengths[1] = 1;
        lengths[2] = 1;
        lengths[3] = 1;
        lengths[4] = 2;
        lengths[5] = 2;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            long result = getLength(n);
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }

    private static long getLength(int n){
        if(n<=5){
            return lengths[n];
        }
        if(lengths[n]>0) return lengths[n];
        lengths[n] = getLength(n-1) + getLength(n-5);
        return lengths[n];
    }
}
