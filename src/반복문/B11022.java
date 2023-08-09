package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class B11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        for(int i=0 ;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            sb.append("Case #" + (i+1) + ": " + n1 + " + " + n2 + " = " + (n1+n2) + "\n");
        }
        System.out.print(sb);
    }
}
