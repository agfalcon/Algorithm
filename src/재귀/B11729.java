package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11729 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int result = moveHannoi(1, 3, K, sb);
        sb.insert(0, result + "\n");
        System.out.print(sb);
    }

    private static int moveHannoi(int start, int dest, int num, StringBuilder sb){
        if(num==1){
            sb.append(start).append(" ").append(dest).append("\n");
            return 1;
        }
        int num1 = moveHannoi(start, 6-start-dest, num-1, sb);
        sb.append(start).append(" ").append(dest).append("\n");
        int num2 = moveHannoi(6-start-dest, dest, num-1, sb);
        return num1 + num2 + 1;
    }
}
