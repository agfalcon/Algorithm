package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B15686 {

    private static ArrayList<int[]> house = new ArrayList<>();
    private static ArrayList<int[]> chicken = new ArrayList<>();
    private static int[] location;

    private static int minDistance = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                int n = Integer.parseInt(st.nextToken());
                if(n==1) house.add(new int[]{i, j});
                else if(n==2) chicken.add(new int[]{i, j});
            }
        }
        location = new int[M];
        getChickenDistance(0, M);
        System.out.println(minDistance);
    }

    private static void getChickenDistance(int level, int depth){
        if(level == depth){
            int distance= 0;
            for(int i=0;i<house.size();i++){
                int r = house.get(i)[0];
                int c = house.get(i)[1];
                int minD = Integer.MAX_VALUE;
                for(int j=0;j<location.length;j++){
                    int r2 = chicken.get(location[j])[0];
                    int c2 = chicken.get(location[j])[1];
                    int d = Math.abs(r-r2) + Math.abs(c-c2);
                    if(minD> d) minD = d;
                }
                distance += minD;
            }
            if(minDistance > distance) minDistance = distance;
            return;
        }

        int start = (level==0) ? 0 : location[level-1]+1;
        for(int i= start; i<chicken.size();i++){
            location[level] = i;
            getChickenDistance(level+1, depth);
        }
    }
}
