package 문자열;

import java.io.*;
import java.util.StringTokenizer;
public class B2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<T;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String input = st.nextToken();
            for(int j=0;j<input.length();j++){
                for(int k=0;k<n;k++){
                    sb.append(input.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
