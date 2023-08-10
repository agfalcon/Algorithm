package 심화1;

import java.io.*;
public class B1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] arr = new int[26];
        for(int i =0;i<input.length();i++){
            char c = input.charAt(i);
            if(Character.isUpperCase(c)) arr[c-'A']++;
            else arr[c-'a']++;
        }
        int index = -1;
        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                index=i;
                max=arr[i];
            }
            else if(arr[i]==max){
                index = -1;
            }
        }
        if(index==-1) System.out.println("?");
        else System.out.println((char)('A'+index));
    }
}
