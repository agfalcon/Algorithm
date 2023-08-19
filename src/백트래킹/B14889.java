package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B14889 {

    private static int[][] ability;
    private static ArrayList<Integer> team1 = new ArrayList<>();
    private static ArrayList<Integer> team2 = new ArrayList<>();

    private static int diff = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ability = new int[N][N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                ability[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        makeTeams(0, N);
        System.out.println(diff);
    }

    private static void makeTeams(int level, int depth){
        if(level == depth){
            int score1 = 0;
            int score2 = 0;
            for(int person1: team1) {
                for(int person2: team1){
                    score1 += ability[person1][person2];
                }
            }
            for(int person1: team2) {
                for(int person2: team2){
                    score2 += ability[person1][person2];
                }
            }
            int result = Math.abs(score2 - score1);
            if(diff > result) diff = result;
            return;
        }
        if(team1.size()<depth/2){
            Integer person = level;
            team1.add(person);
            makeTeams(level+1, depth);
            team1.remove(person);
        }
        if(team2.size()<depth/2){
            Integer person = level;
            team2.add(person);
            makeTeams(level+1, depth);
            team2.remove(person);
        }
    }
}