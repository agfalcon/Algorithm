package _1차원배열;

import java.io.*;
public class B3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        for(int i=0;i<10;i++){
            int num = Integer.parseInt(br.readLine());
            arr[num%42] = true;
        }
        int result = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]) result++;
        }
        System.out.println(result);
    }
}
