package 문자열;

import java.io.*;
public class B1152 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split(" ");
        int result = 0;
        for(int i =0 ;i<input.length;i++){
            if(input[i].isBlank()) continue;
            result++;
        }
        System.out.println(result);
    }
}
