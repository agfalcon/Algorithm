package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10971 {

    private static int[][] weight;
    private static boolean[] visited;
    private static int[] way;

    private static int cost = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        way = new int[N];
        visited = new boolean[N];
        weight = new int[N][N];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0;j<N;j++){
                weight[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        findBestWay(0, N);
        System.out.println(cost);
    }

    private static void findBestWay(int level, int depth){
        if(level == depth){
            int result =0;
            for(int i=0;i<way.length-1;i++){
                result += weight[way[i]][way[i+1]];
            }
            result += weight[way[way.length-1]][way[0]];
            if(result<cost) cost = result;
            return;
        }
        for(int i=0;i<way.length;i++){
            if(!visited[i]){
                if(level>0 && weight[way[level-1]][i]==0) continue;
                if(level==depth-1 && weight[i][way[0]]==0) continue;
                visited[i] = true;
                way[level] = i;
                findBestWay(level+1, depth);
                visited[i] = false;
            }
        }
    }
}
