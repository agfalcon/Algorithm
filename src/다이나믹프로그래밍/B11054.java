package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11054 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] num = new int[N];
        for(int i=0;i<num.length;i++){
            num[i] = 1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    num[i] = Math.max(num[i], num[j]+1);
                }
            }
        }
        int[] num2 = new int[N];
        int max = 0;
        for(int i=num.length-1;i>=0;i--){
            num2[i] = 1;
            for(int j=num2.length-1; j>i;j--){
                if(arr[j] < arr[i]){
                    num2[i] = Math.max(num2[i], num2[j]+1);
                }
            }
            if(max < num[i] + num2[i] -1) max = num[i] + num2[i] - 1;
        }
        System.out.println(max);
    }
}
