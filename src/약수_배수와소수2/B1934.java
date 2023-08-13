package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1934 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        for(int i =0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            sb.append(lcm(n1,n2)).append("\n");
        }
        System.out.print(sb);
    }

    private static int lcm(int n1, int n2) {
        return n1*n2/gcd(n1,n2);
    }

    private static int gcd(int n1, int n2) {
        if(n1%n2==0) return n2;
        return gcd(n2, n1%n2);
    }
}
