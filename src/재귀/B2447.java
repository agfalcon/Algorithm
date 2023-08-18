package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2447 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] star = new String[N];
        for(int i=0;i< star.length;i++){
            star[i] = "";
        }
        drawStar(star, 0, N-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<star.length;i++){
            sb.append(star[i]).append("\n");
        }
        System.out.print(sb);
    }

    private static void drawStar(String[] star, int start, int end){
        int level = end-start+1;
        if(level==3){
            star[start] += "***";
            star[start+1] += "* *";
            star[end] += "***";
            return;
        }
        for(int i=0;i<3;i++){
            drawStar(star, start, start + level/3-1);
        }
        drawStar(star, start + level/3, start + level/3*2 -1);
        for(int i=start+level/3;i<start +level/3*2;i++){
            for(int j=0;j<level/3;j++){
                star[i] += " ";
            }
        }
        drawStar(star, start + level/3, start + level/3*2 -1);
        for(int i=0;i<3;i++){
            drawStar(star, start + level/3*2, end);
        }
    }
}
