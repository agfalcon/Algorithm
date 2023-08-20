package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class B2580 {

    private static int[][] sudoku = new int[9][9];
    private static int[][] free;
    private static boolean[][] row = new boolean[9][9];
    private static boolean[][] col = new boolean[9][9];
    private static boolean[][] box = new boolean[9][9];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                row[i][j] = false;
                col[i][j] = false;
                box[i][j] = false;
            }
        }
        StringTokenizer st;
        int depth =0;
        ArrayList<Integer[]> temp = new ArrayList<>();
        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                int n = Integer.parseInt(st.nextToken());
                if(n==0) {
                    depth++;
                    temp.add(new Integer[]{i, j});
                }else{
                    sudoku[i][j] = n;
                    row[i][n-1] = true;
                    col[j][n-1] = true;
                    box[i/3*3+j/3][n-1] = true;
                }
            }
        }
        free = new int[depth][2];
        for(int i=0;i<temp.size();i++){
            free[i][0] = temp.get(i)[0];
            free[i][1] = temp.get(i)[1];
        }
        makeSudoku(0, depth);
    }

    private static boolean makeSudoku(int level, int depth){
        if(level == depth){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++) {
                    sb.append(sudoku[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb);
            return true;
        }
        int r = free[level][0];
        int c = free[level][1];
        for(int j=0;j<9;j++){
            if(row[r][j]) continue;
            for(int t=0;t<9;t++){
                if(col[c][t]) continue;
                for(int k=0;k<9;k++){
                    if(box[r/3*3 +c/3][k]) continue;
                    if(j==t && j==k){
                        sudoku[r][c] = j+1;
                        row[r][j] = true;
                        col[c][j] = true;
                        box[r/3*3+c/3][j] =true;
                        if(makeSudoku(level+1, depth)) return true;
                        row[r][j] = false;
                        col[c][j] = false;
                        box[r/3*3+c/3][j] =false;
                    }
                }
            }
        }
        return false;
    }
}
