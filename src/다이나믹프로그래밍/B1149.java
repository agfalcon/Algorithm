package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1149 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] cost = new int[N][3];
        int[][] minCost = new int[N][3];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<3;j++){
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        calculateCost(cost, minCost);
        System.out.println(Math.min(minCost[N-1][0], Math.min(minCost[N-1][1], minCost[N-1][2])));
    }

    private static void calculateCost(int[][] cost, int[][] minCost){
        for(int i=0;i<3;i++){
            minCost[0][i] = cost[0][i];
        }
        for(int i=1;i<cost.length;i++){
            minCost[i][0] = Math.min(minCost[i-1][1], minCost[i-1][2]) + cost[i][0];
            minCost[i][1] = Math.min(minCost[i-1][0], minCost[i-1][2]) + cost[i][1];
            minCost[i][2] = Math.min(minCost[i-1][1], minCost[i-1][0]) + cost[i][2];
        }
    }
}
