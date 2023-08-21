package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1075 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())/100*100;
        int F = Integer.parseInt(br.readLine());
        for(int i=0;i<100;i++){
            if((N+i)%F==0) {
                System.out.printf("%02d%n", i);
                return;
            }
        }
    }
}
