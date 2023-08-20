package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9663 {
    private static int[] queens;
    private static boolean[] col;
    private static int num = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        queens = new int[N];
        col = new boolean[N];
        makeNQueen(N,0,N);
        System.out.println(num);
    }

    private static void makeNQueen(int size, int level, int depth){
        if(level == depth){
            num++;
            return;
        }
        for(int i =0;i<size;i++){
            if(!col[i] && checkValid(i,level)){
                queens[level] = i;
                col[i] = true;
                makeNQueen(size, level+1, depth);
                col[i] = false;
            }
        }
    }

    private static boolean checkValid(int i, int level){
        for(int l=0;l<level;l++){
            int col = queens[l];
            if(Math.abs(col-i)==Math.abs(l-level)) return false;
        }
        return true;
    }
}
