package 반복문;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class B8393 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(n*(n+1)/2);
    }
}
