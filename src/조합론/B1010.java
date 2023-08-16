package 조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class B1010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            long M = Integer.parseInt(st.nextToken());
            BigDecimal result = BigDecimal.valueOf(1);
            for(long j = 0;j <N;j++){
                result = result.multiply(BigDecimal.valueOf(M-j));
            }
            for(long j = 1;j<=N;j++){
                result = result.divide(BigDecimal.valueOf(j));
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
