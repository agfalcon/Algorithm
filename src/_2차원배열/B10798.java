package _2차원배열;

import java.io.*;
import java.util.Arrays;

public class B10798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] word = new char[5][15];
        for (char[] chars : word) {
            Arrays.fill(chars, ' ');
        }
        for(int i=0;i<5;i++){
            String input = br.readLine();
            for(int j=0;j<input.length();j++){
                word[i][j] = input.charAt(j);
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(word[j][i]!=' ') sb.append(word[j][i]);
            }
        }
        System.out.println(sb);
    }
}
