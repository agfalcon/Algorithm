package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2579 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] score = new int[N];
        int result = calculateBestScore(arr, score, N-1);
        System.out.println(result);
    }

    private static int calculateBestScore(int[] arr, int[] score, int step){
        if(step<0){
            return 0;
        }
        else if(step==0){
            return arr[0];
        }
        else if(step==1){
            return arr[0] + arr[1];
        }
        else{
            if(score[step]>0) return score[step];
            score[step] = Math.max(arr[step-1]+arr[step]+calculateBestScore(arr,score,step-3), arr[step]+calculateBestScore(arr,score,step-2));
            return score[step];
        }
    }
}
