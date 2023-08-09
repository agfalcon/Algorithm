package 반복문;

import java.io.*;
import java.util.StringTokenizer;
public class B15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            sb.append(n1+n2).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
