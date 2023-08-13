package 약수_배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] sosu = new boolean[123456*2+1];
        sosu[1] = true;
        for(int i = 2; i<sosu.length;i++){
            if(sosu[i]) continue;
            for(int j = i*2 ; j<sosu.length; j+=i){
                sosu[j] = true;
            }
        }
        StringBuffer sb = new StringBuffer();
        String input;
        while(!(input=br.readLine()).equals("0")){
            int n = Integer.parseInt(input);
            int result = 0;
            for(int j =n+1;j<=2*n;j++){
                if(!sosu[j]) result++;
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
