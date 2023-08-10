package 문자열;

import java.io.*;
import java.util.Arrays;

public class B10869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for(int i=0;i<word.length();i++){
            if(arr[word.charAt(i)-'a']==-1) arr[word.charAt(i)-'a'] = i;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
