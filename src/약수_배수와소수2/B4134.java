package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4134 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<T;i++){
            long n = Long.parseLong(br.readLine());
            while(true){
                boolean isSosu = true;
                if(n==0 || n==1){
                    n++;
                    continue;
                }
                for(long j = 2; j<=Math.sqrt(n);j++){
                    if(n%j==0) {
                        isSosu = false;
                         break;
                    }
                }
                if(isSosu) break;
                else n++;
            }
            sb.append(n).append("\n");
        }
        System.out.print(sb);
    }
}
