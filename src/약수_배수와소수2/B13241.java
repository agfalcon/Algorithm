package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13241 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n1 = Long.parseLong(st.nextToken());
        long n2 = Long.parseLong(st.nextToken());
        System.out.println(lcm(n1,n2));
    }

    private static long lcm(long n1, long n2){
        return n1*n2/gcd(n1,n2);
    }

    private static long gcd(long n1, long n2) {
        if(n1%n2==0) return n2;
        return gcd(n2, n1%n2);
    }
}
