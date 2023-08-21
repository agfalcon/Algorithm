package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10819 {
    private static int[] arr;
    private static boolean[] visited;
    private static int[] answer;

    private static int result = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        visited = new boolean[N];
        answer = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        getMaxDiff(0, N);
        System.out.println(result);
    }

    private static void getMaxDiff(int level, int depth){
        if(level == depth){
            int sum = 0;
            for(int i=0;i<answer.length-1;i++){
                sum += Math.abs(answer[i] - answer[i+1]);
            }
            if(result < sum) result = sum;
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                visited[i] = true;
                answer[level] = arr[i];
                getMaxDiff(level+1, depth);
                visited[i] = false;
            }
        }
    }
}
