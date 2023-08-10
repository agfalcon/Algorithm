package _1차원배열;

import java.io.*;
public class B5587 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        for(int i=0;i<28;i++){
            int num = Integer.parseInt(br.readLine());
            arr[num] = true;
        }
        for(int i=1;i<31;i++){
            if(!arr[i]) System.out.println(i);
        }
    }
}
