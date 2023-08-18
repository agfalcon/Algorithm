package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15650 {

    private static int[] arr;
    private static boolean[] visited;

    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1];
        arr = new int[M];
        makeSequences(0, M);
        System.out.print(sb);
    }

    private static void makeSequences(int depth, int end){
        if(depth==end){
            for(int i : arr){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=visited.length-1;i++){
            if(!visited[i]){
                if(depth!=0 && arr[depth-1] > i) continue;
                arr[depth] = i;
                visited[i] = true;
                makeSequences(depth+1, end);
                visited[i] = false;
            }
        }
    }
}
