package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] stat = new int[N][2];
        StringTokenizer st;
        for(int i=0; i<N;i++){
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            stat[i][0] = weight;
            stat[i][1] = height;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            int rank = 0;
            for(int j=0;j<N;j++){
                if(i==j) continue;
                if(stat[i][0] < stat[j][0] && stat[i][1] < stat[j][1]) rank++;
            }
            sb.append(rank+1).append(" ");
        }
        System.out.println(sb);
    }
}
