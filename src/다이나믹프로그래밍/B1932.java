package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1932 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] triangle = new int[N][N];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<=i;j++){
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = getMaxRoute(triangle);
        System.out.println(result);
    }

    private static int getMaxRoute(int[][] triangle){
        int[][] sum = new int[triangle.length][triangle.length];
        sum[0][0] = triangle[0][0];
        for(int i=1;i<sum.length;i++){
            for(int j=0;j<=i;j++){
                if(j==0) sum[i][j] = sum[i-1][j] + triangle[i][j];
                else if(j==i) sum[i][j] = sum[i-1][j-1] + triangle[i][j];
                else sum[i][j] = Math.max(sum[i-1][j-1], sum[i-1][j]) + triangle[i][j];
            }
        }
        int max = 0;
        for(int i=0;i<sum.length;i++){
            if(max< sum[sum.length-1][i]) max = sum[sum.length-1][i];
        }
        return max;
    }
}
