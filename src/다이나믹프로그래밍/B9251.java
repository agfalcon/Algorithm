package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9251 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();
        int result = getLCS(input1, input2);
        System.out.println(result);
    }

    private static int getLCS(String input1, String input2){
        if(input1.isEmpty() || input2.isEmpty()) return 0;
        int max = 0;
        int[][] length = new int[input1.length()+1][input2.length()+1];
        for(int i=1;i<length.length;i++){
            for(int j=1;j<length[i].length;j++){
                char c1 = input1.charAt(i-1);
                char c2 = input2.charAt(j-1);
                if(c1==c2){
                    length[i][j] = length[i-1][j-1] + 1;
                }
                else{
                    length[i][j] = Math.max(length[i-1][j], length[i][j-1]);
                }
                if(max < length[i][j]) max = length[i][j];
            }
        }
        return max;
    }
}
