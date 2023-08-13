package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        boolean[] sosu = new boolean[n2+1];
        sosu[1] = true;
        for(int i = 2;i<sosu.length;i++){
            if(sosu[i]) continue;;
            for(int j = 2*i; j< sosu.length;j+=i){
                sosu[j] = true;
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=n1; i<=n2;i++){
            if(!sosu[i]) sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}
