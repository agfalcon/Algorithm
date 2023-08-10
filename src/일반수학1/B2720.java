package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<T;i++){
            int cent = Integer.parseInt(br.readLine());
            sb.append(cent/25).append(" ");
            cent%=25;
            sb.append(cent/10).append(" ");
            cent%=10;
            sb.append(cent/5).append(" ");
            cent%=5;
            sb.append(cent).append("\n");
        }
        System.out.print(sb);
    }
}
