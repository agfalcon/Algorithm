package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class B18111 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        HashSet<Integer> height = new HashSet<>();
        int[][] land = new int [N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                land[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<=256;i++){
            height.add(i);
        }
        Iterator<Integer> iterator = height.iterator();
        int resultHeight = -1;
        int minTime = Integer.MAX_VALUE;
        while(iterator.hasNext()){
            int h = iterator.next();
            int time = getTime(land, B, h);
            if(minTime > time) {
                minTime = time;
                resultHeight = h;
            }
            if(minTime == time && resultHeight < h) resultHeight = h;
        }
        System.out.println(minTime + " " + resultHeight);
    }

    private static int getTime(int[][] land, long B, int height) {
        int time = 0;
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[i].length;j++){
                if(land[i][j] == height) continue;
                else if(land[i][j] >height) {
                    int diff = land[i][j] - height;
                    B+= diff;
                    time += diff * 2;
                }
                else{
                    int diff = height - land[i][j];
                    B-= diff;
                    time += diff;
                }
            }
        }
        if(B<0) return Integer.MAX_VALUE;
        return time;
    }
}
