package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num==1) return;
        StringBuffer sb = new StringBuffer();
        int divider = 2;
        while(num>1){
            if(num%divider==0){
                sb.append(divider).append("\n");
                num/=divider;
            }
            else{
                divider++;
            }
        }
        System.out.print(sb);
    }
}
