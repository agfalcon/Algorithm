package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coordinate = new int[N][2];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coordinate, (c1, c2) -> {
            if(c1[0]==c2[0]) return c1[1]- c2[1];
            else return c1[0] - c2[0];
        });
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<coordinate.length;i++){
            sb.append(coordinate[i][0]).append(" ").append(coordinate[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}
