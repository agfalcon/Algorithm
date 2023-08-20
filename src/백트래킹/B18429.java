package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18429 {

    private static int K;
    private static int[] weight;
    private static boolean[] visited;
    private static int answer = 0;
    private static int ability = 500;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        weight = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            weight[i] = Integer.parseInt(st.nextToken());
        }
        excercise(0, N);
        System.out.println(answer);
    }

    private static void excercise(int level, int depth){
        if(level == depth){
            answer++;
            return;
        }
        for(int i=0;i<weight.length;i++){
            if(!visited[i] && ability-K+weight[i]>=500){
                visited[i] = true;
                ability = ability-K+weight[i];
                excercise(level+1, depth);
                visited[i] = false;
                ability = ability+K-weight[i];
            }
        }
    }
}
