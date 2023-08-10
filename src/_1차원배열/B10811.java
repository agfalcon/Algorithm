package _1차원배열;

import java.io.*;
import java.util.StringTokenizer;
public class B10811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i] = i;
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int index1 = Integer.parseInt(st.nextToken());
            int index2 = Integer.parseInt(st.nextToken());
            int[] temp = new int[index2-index1+1];
            for(int j=index2;j>=index1;j--){
                temp[index2-j] = arr[j];
            }
            for(int j=index1;j<=index2;j++){
                arr[j] = temp[j-index1];
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=N;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
