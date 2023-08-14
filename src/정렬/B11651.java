package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11651 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] coordinates = new int[N][2];
        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken());
            coordinates[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coordinates, (c1, c2) ->{
            if(c1[1]==c2[1]) return c1[0] - c2[0];
            else return c1[1] - c2[1];
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            sb.append(coordinates[i][0]).append(" ").append(coordinates[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}
