package 반복문;

import java.io.*;
public class B2438 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
