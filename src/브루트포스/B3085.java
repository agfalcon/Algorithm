package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        char[][] board = new char[N][N];
        for(int i=0;i<N;i++){
            String input = br.readLine();
            for(int j=0;j<input.length();j++){
                board[i][j] = input.charAt(j);
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N-1;j++){
                swap(i, j, i, j+1, board);
                int num = getMaxCandy(board);
                if(answer < num) answer = num;
                swap(i, j, i, j+1, board);
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N-1;j++){
                swap(j, i, j+1, i, board);
                int num = getMaxCandy(board);
                if(answer < num) answer = num;
                swap(j, i, j+1, i, board);
            }
        }
        System.out.println(answer);
    }

    private static int getMaxCandy(char[][] board){
        int max = 0;
        for(int i=0;i<board.length;i++){
            int num = 1;
            char c = board[i][0];
            for(int j=1;j<board[i].length;j++){
                if(board[i][j] == c) {
                    num++;
                }
                else{
                    if(max < num) max = num;
                    num = 1;
                    c = board[i][j];
                }
            }
            if(max < num) max = num;
        }
        for(int i=0;i<board.length;i++){
            int num = 1;
            char c = board[0][i];
            for(int j=1;j<board.length;j++){
                if(board[j][i] == c) {
                    num++;
                }
                else{
                    if(max < num) max = num;
                    num = 1;
                    c = board[j][i];
                }
            }
            if(max < num) max = num;
        }
        return max;
    }

    private static void swap(int r1, int c1, int r2, int c2, char[][] board){
        char temp  = board[r1][c1];
        board[r1][c1] = board[r2][c2];
        board[r2][c2] = temp;
    }
}
