package _1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B2562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);
    }
}
