package 시간복잡도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24267 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long result = 0;
        for(long i = n-2;i>=1;i--){
            result += i*(i+1)/2;
        }
        System.out.println(result);
        System.out.println(3);
    }
}
