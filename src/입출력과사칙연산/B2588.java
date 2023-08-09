package 입출력과사칙연산;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class B2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int[] result = new int[3];
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<3;i++){
            result[i] = n1 * (n2%10);
            n2/=10;
            sb.append(result[i]).append("\n");
        }
        sb.append(result[0] + result[1]*10 + result[2]*100);
        System.out.println(sb);
    }
}
