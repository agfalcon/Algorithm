package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14502 {

    private static int[][] lab;
    private static int[][] wall = new int[3][2];

    private static int safeArea = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        lab = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                lab[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        getMaxSafeArea(0, 3);
        System.out.println(safeArea);
    }

    private static void getMaxSafeArea(int level, int depth){
        if(level == depth){
            int area = spreadVirus();
            if(safeArea < area) safeArea = area;
            return;
        }

        for(int i=0;i<lab.length;i++){
            for(int j=0;j<lab[i].length;j++){
                if(level>0 && (i<wall[level-1][0] || (i==wall[level-1][0] && j<=wall[level-1][1]))) continue;
                if(lab[i][j]==0){
                    wall[level][0] = i;
                    wall[level][1] = j;
                    lab[i][j] =1;
                    getMaxSafeArea(level+1, depth);
                    lab[i][j] = 0;
                }
            }
        }
    }

    private static int spreadVirus(){
        int[][] temp = new int[lab.length][lab[0].length];
        for(int i=0;i<lab.length;i++){
            for(int j=0;j<lab[i].length;j++){
                temp[i][j] = lab[i][j];
            }
        }
        for(int i=0;i<lab.length;i++){
            for(int j=0;j<lab[i].length;j++){
                if(lab[i][j]==2){
                    spreadVirus(i,j, temp);
                }
            }
        }
        int result = 0;
        for(int i=0;i<lab.length;i++){
            for(int j=0;j<lab[i].length;j++){
                if(temp[i][j]==0)  result++;
            }
        }
        return result;
    }

    private static void spreadVirus(int i, int j, int[][] temp){
        temp[i][j] = 2;
        if(i>0 && temp[i-1][j]==0) spreadVirus(i-1,j, temp);
        if(j>0 && temp[i][j-1]==0) spreadVirus(i, j-1, temp);
        if(i<lab.length-1 && temp[i+1][j]==0) spreadVirus(i+1, j, temp);
        if(j<lab[0].length-1 && temp[i][j+1]==0) spreadVirus(i, j+1, temp);
    }
}
