package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2485 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0;i<arr.length;i++){
            arr[i] =  Integer.parseInt(br.readLine());
        }
        int gcd = arr[1]-arr[0];
        for(int i = 2;i<arr.length;i++){
            gcd = gcd(gcd, arr[i]-arr[i-1]);
        }
        int result  = 0;
        for(int i=1;i<arr.length;i++){
            result += (arr[i]-arr[i-1])/gcd-1;
        }
        System.out.println(result);
    }

    private static int gcd(int n1, int n2){
        if(n1%n2==0) return n2;
        return gcd(n2, n1%n2);
    }
}
