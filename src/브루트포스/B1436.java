package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {
    public static void main(String[] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int n =0;
        int num = 666;
        while(n!=N){
            if(String.valueOf(num).contains("666")) n++;
            num++;
        }
        System.out.println(num-1);
    }
}
