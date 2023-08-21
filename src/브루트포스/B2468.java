package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2468 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] height = new int[N][N];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                int h = Integer.parseInt(st.nextToken());
                height[i][j] = h;
            }
        }
        boolean[][] safeLand = new boolean[N][N];
        int answer = 0;
        int waterHeight = 0;
        while(true){
            getSafeLand(height, safeLand, waterHeight);
            int result = getNumOfSafeLand(safeLand);
            if(result==0) break;
            if(result> answer) answer = result;
            waterHeight++;
        }
        System.out.println(answer);
    }

    private static void getSafeLand(int[][] height, boolean[][] safeLand, int waterHeight){
        for(int i=0;i<safeLand.length;i++){
            for(int j=0; j<safeLand[i].length;j++){
                safeLand[i][j] = true;
                if(waterHeight>=height[i][j]) safeLand[i][j] = false;
            }
        }
    }

    private static int getNumOfSafeLand(boolean[][] safeLand){
        int num = 0;
        for(int i=0;i<safeLand.length;i++){
            for(int j=0;j<safeLand[i].length;j++){
                if(safeLand[i][j]){
                    num++;
                    removeNearSafeLand(safeLand, i, j);
                }
            }
        }
        return num;
    }

    private static void removeNearSafeLand(boolean[][] safeLand, int i, int j){
        safeLand[i][j] = false;
        if(i>0 && safeLand[i-1][j]) removeNearSafeLand(safeLand, i-1, j);
        if(i<safeLand.length-1 && safeLand[i+1][j]) removeNearSafeLand(safeLand, i+1, j);
        if(j>0 && safeLand[i][j-1]) removeNearSafeLand(safeLand, i, j-1);
        if(j<safeLand.length-1 && safeLand[i][j+1]) removeNearSafeLand(safeLand, i, j+1);
    }
}
