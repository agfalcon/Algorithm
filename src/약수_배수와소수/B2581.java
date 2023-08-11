package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        boolean[] sosu = new boolean[end+1];
        sosu[1] = true;
        for(int i=2;i<sosu.length;i++){
            if(sosu[i]) continue;
            for(int j=2*i;j<sosu.length;j+=i){
                sosu[j] = true;
            }
        }
        int sum = 0;
        int min = 0;
        for(int i=start;i<=end;i++){
            if(!sosu[i]){
                if(min==0) min = i;
                sum+= i;
            }
        }
        if(min==0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
