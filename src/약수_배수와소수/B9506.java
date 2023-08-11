package 약수_배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuffer sb = new StringBuffer();
        while(!(input = br.readLine()).equals("-1")){
            int num = Integer.parseInt(input);
            StringBuffer temp = new StringBuffer().append(num).append(" = ");
            int sum =0;
            for(int i=1;i<=num/2+1;i++){
                if(num%i==0) {
                    sum+=i;
                    temp.append(i);
                    if(num!=sum) temp.append(" + ");
                }
                if(sum>num){
                    temp = new StringBuffer().append(num).append(" is NOT perfect.");
                    break;
                }
            }
            if(sum<num){
                temp = new StringBuffer().append(num).append(" is NOT perfect.");
            }
            sb.append(temp).append("\n");
        }
        System.out.print(sb);
    }
}
