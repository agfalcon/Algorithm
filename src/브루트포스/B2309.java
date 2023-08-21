package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2309 {

    private static int[] height;
    private static int[] answer;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        height = new int[9];
        answer = new int[7];
        visited = new boolean[9];
        for(int i=0;i<9;i++){
            height[i] = Integer.parseInt(br.readLine());
        }
        findNanjeng(0, 7);
    }

    private static boolean findNanjeng(int level, int depth){
        if(level == depth){
            int sum = 0;
            for(int i=0;i<answer.length;i++){
                sum += answer[i];
            }
            if(sum==100){
                Arrays.sort(answer);
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<answer.length;i++){
                    sb.append(answer[i]).append("\n");
                }
                System.out.print(sb);
                return true;
            }
            return false;
        }
        for(int i=0;i<height.length;i++){
            if(!visited[i]){
                visited[i] = true;
                answer[level] = height[i];
                if(findNanjeng(level+1, depth)) return true;
                visited[i] = false;
            }
        }
        return false;
    }
}
