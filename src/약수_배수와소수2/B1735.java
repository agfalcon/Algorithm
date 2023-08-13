package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1735 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long c1 = Long.parseLong(st.nextToken());
        long p1 = Long.parseLong(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long c2 = Long.parseLong(st.nextToken());
        long p2 = Long.parseLong(st.nextToken());
        long p = lcm(p1, p2);
        long c = c1*p/p1 + c2*p/p2;
        long g = gcd(p,c);
        System.out.println(c/g + " " + p/g);
    }

    private static long lcm(long n1, long n2){
        return n1 * n2 / gcd(n1, n2);
    }

    private static long gcd(long n1, long n2) {
        if(n1%n2==0) return n2;
        return gcd(n2, n1 %n2);
    }
}
