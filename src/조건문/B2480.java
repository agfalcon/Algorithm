package 조건문;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class B2480 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result;
        if(a==b && b==c) result = 10000 + 1000 * a;
        else if(a!=b && b!=c && a!=c) result = 100 * Math.max(a, Math.max(b, c));
        else{
            if(a==b || a==c) result = 1000 + 100 * a;
            else result = 1000 + 100 * b;
        }
        System.out.println(result);
    }
}
