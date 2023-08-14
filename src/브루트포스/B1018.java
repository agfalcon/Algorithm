package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] chess = new char[N][M];
        for(int i=0;i<N;i++){
            String input = br.readLine();
            for(int j=0;j<M;j++){
                chess[i][j] = input.charAt(j);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<=N-8;i++){
            for(int j=0;j<=M-8;j++){
                int result = getRepaintNum(chess, i, j);
                if(result < min) min = result;
            }
        }
        System.out.println(min);
    }

    private static int getRepaintNum(char[][] chess, int i, int j){
        int result1 = 0;
        int result2 = 0;
        for(int r = i; r<i+8;r++){
            for(int c = j; c<j+8;c++){
                char color = chess[r][c];
                if((r+c)%2==0){
                    if(color=='W') result1++;
                    else result2++;
                } else{
                    if(color=='B') result1++;
                    else result2++;
                }
            }
        }
        return Math.min(result1, result2);
    }
}
