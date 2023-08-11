package 일반수학1;

import java.io.*;
import java.util.StringTokenizer;

public class B2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        System.out.println((int)(Math.ceil((double)(V-A)/(A-B))+1));
    }
}
