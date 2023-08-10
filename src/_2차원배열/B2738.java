package _2차원배열;

import java.io.*;
import java.util.StringTokenizer;
public class B2738 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i=0;i<N*2;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i%N][j] += Integer.parseInt(st.nextToken());
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
