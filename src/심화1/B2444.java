package 심화1;

import java.io.*;
public class B2444 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<num;i++){
            for(int j=i;j<num-1;j++){
                sb.append(" ");
            }
            for(int j=0;j<2*i+1;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=1;i<num;i++){
            for(int j=0;j<i;j++){
                sb.append(" ");
            }
            for(int j=0;j<2*(num-i)-1;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
