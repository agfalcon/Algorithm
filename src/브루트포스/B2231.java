package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<n;i++){
            int temp = i;
            int temp2 = i;
            while(temp2>0){
                temp += temp2%10;
                temp2/=10;
            }
            if(temp==n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
