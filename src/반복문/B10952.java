package 반복문;

import java.io.*;
import java.util.StringTokenizer;
public class B10952 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        while(true){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            if(n1==0 && n2==0) break;
            sb.append(n1+n2).append("\n");
        }
        System.out.print(sb);
    }
}
