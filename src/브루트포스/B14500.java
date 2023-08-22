package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14500 {

    private static int[][] board;
    private static boolean[][] visited;

    private static int max = 0;
    private static int sum = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        putTetromino(0, 0, 0, 4);
        System.out.println(max);
    }

    private static void putTetromino(int i, int j, int level, int depth){
        if(level == depth){
            if(sum > max) max = sum;
            return;
        }

        int rStart = level==0 ? 0 : i-1;
        int rEnd = level==0 ? board.length-1 : i+1;
        int cStart = level==0 ? 0 : j-1;
        int cEnd = level==0 ? board[i].length-1 : j+1;
        for(int r=rStart;r<=rEnd;r++){
            if(r<0 || r>= board.length) continue;
            for(int c=cStart;c<=cEnd;c++){
                if(c<0 || c>= board[r].length) continue;
                if(!visited[r][c]){
                    if(level>0){
                        int nearNum = 0;
                        if(r>0 && visited[r-1][c]) nearNum++;
                        if(c>0 && visited[r][c-1]) nearNum++;
                        if(r<board.length-1 && visited[r+1][c]) nearNum++;
                        if(c<board[r].length-1 && visited[r][c+1]) nearNum++;
                        if(nearNum==0) continue;
                    }
                    visited[r][c] = true;
                    sum+= board[r][c];
                    putTetromino(r,c,level+1, depth);
                    visited[r][c] = false;
                    sum-= board[r][c];
                }
            }
        }
    }
}
