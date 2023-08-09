package _1차원배열;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int n = Integer.parseInt(st.nextToken());
            if(n<X) sb.append(n).append(" ");
        }
        System.out.println(sb);
    }
}
