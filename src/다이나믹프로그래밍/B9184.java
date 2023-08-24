package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9184 {

    private static int[][][] memory = new int[21][21][21];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());
            if(n1 == -1 && n2 == -1 && n3 == -1) break;
            int n = recur(n1, n2, n3);
            sb.append("w(").append(n1).append(", ").append(n2).append(", ").append(n3).append(") = ").append(n).append('\n');
        }
        System.out.print(sb);
    }

    private static int recur(int n1, int n2, int n3){
        if(n1<=0 || n2<=0 || n3<=0) return 1;
        else if(n1 > 20 || n2 > 20 || n3> 20) return recur(20, 20, 20);
        if(memory[n1][n2][n3]>0) return memory[n1][n2][n3];
        if(n1 < n2 && n2 < n3){
            memory[n1][n2][n3] = recur(n1, n2, n3-1) + recur(n1, n2-1, n3-1) - recur(n1, n2-1, n3);
            return memory[n1][n2][n3];
        }
        else{
            memory[n1][n2][n3] = recur(n1-1, n2, n3) + recur(n1-1, n2-1, n3) + recur(n1-1, n2, n3-1) - recur(n1-1, n2-1, n3-1);
            return memory[n1][n2][n3];
        }
    }
}
