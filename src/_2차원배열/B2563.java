package _2차원배열;

import java.io.*;
import java.util.StringTokenizer;
public class B2563 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        boolean[][] paper = new boolean[100][100];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            for(int j=r;j<r+10;j++){
                for(int k=c;k<c+10;k++){
                    paper[j][k] = true;
                }
            }
        }
        int square = 0;
        for (boolean[] booleans : paper) {
            for (boolean aBoolean : booleans) {
                if (aBoolean) square++;
            }
        }
        System.out.println(square);
    }
}
