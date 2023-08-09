package 반복문;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class B2739 {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=1; i<=9 ;i++){
            sb.append(N + " * " + i + " = " + N*i).append("\n");
        }
        System.out.print(sb);
    }
}
