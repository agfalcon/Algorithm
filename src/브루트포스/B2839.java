package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int c3 = 0;
        int c5 = 0;
        while(true){
            c5=0;
            while(true){
                int result = c5*5 + c3*3;
                if(result<N) c5++;
                else if(result==N) {
                    System.out.println(c5+c3);
                    return;
                }
                else break;
            }
            c3++;
            if(c3*3>N) break;
        }
        System.out.println(-1);
    }
}
