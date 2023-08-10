package _1차원배열;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class B1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<score.length;i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        int max = Arrays.stream(score).max().getAsInt();
        double sum = 0;
        for(int i=0;i<score.length;i++){
            sum+= (double)score[i]/max*100;
        }
        System.out.println(sum/N);
    }
}
