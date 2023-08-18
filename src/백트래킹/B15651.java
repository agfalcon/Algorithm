package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15651 {

    private static int[] answer;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        answer = new int[M];
        makeSequences(N, 0, M);
        System.out.print(sb);
    }

    private static void makeSequences(int N, int level, int depth){
        if(level==depth){
            for(int i : answer){
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1;i<=N;i++){
            answer[level] = i;
            makeSequences(N, level+1, depth);
        }
    }
}
