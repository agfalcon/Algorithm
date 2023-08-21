package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=1;i<=N;i++){
            if(isHansu(i)) answer++;
        }
        System.out.println(answer);
    }

    private static boolean isHansu(int num){
        boolean result = true;
        if(num>=100) {
            int n1 = num%10;
            int n2 = num/10%10;
            int n3 = num/100;
            if(n1-n2 != n2-n3) result = false;
        }
        return result;
    }
}
