package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B17103 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] sosu = new boolean[1000001];
        sosu[1] = true;
        for(int i=2;i<sosu.length;i++){
            if(sosu[i]) continue;
            for(int j= i*2;j< sosu.length;j+=i){
                sosu[j] = true;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<T;i++){
            int n = Integer.parseInt(br.readLine());
            int result = 0;
            for(int j = 2; j<=n/2;j++){
                if(!sosu[j] && !sosu[n-j]) result++;
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
