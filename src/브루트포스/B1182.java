package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1182 {
    private static int[] arr;
    private static boolean[] visited;
    private static int S;
    private static int answer = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=N;i++){
            getZeroSum(0, 0, i);
        }
        System.out.println(answer);
    }

    private static void getZeroSum(int prev, int level, int depth){
        if(level == depth){
            int sum = 0;
            for(int i=0;i<visited.length;i++){
                if(visited[i]) sum+=arr[i];
            }
            if(sum==S) answer++;
            return;
        }
        for(int i=prev;i<arr.length;i++){
            if(!visited[i]){
                visited[i] = true;
                getZeroSum(i+1, level+1, depth);
                visited[i] = false;
            }
        }
    }
}
