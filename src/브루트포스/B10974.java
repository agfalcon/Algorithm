package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10974 {

    private static int[] arr;
    private static int[] arrCase;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        arrCase = new int[N];
        visited = new boolean[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1;
        }
        makeSequences(0, N);
        System.out.print(sb);
    }

    private static void makeSequences(int level, int depth){
        if(level == depth){
            for(int i=0;i<arrCase.length;i++){
                sb.append(arrCase[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                visited[i] = true;
                arrCase[level] = arr[i];
                makeSequences(level+1, depth);
                visited[i] = false;
            }
        }
    }
}
