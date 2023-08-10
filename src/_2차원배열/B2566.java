package _2차원배열;

import java.io.*;
import java.util.StringTokenizer;
public class B2566 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int max = -1;
        int r = -1;
        int c = -1;
        for(int i=1;i<=9;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=9;j++){
                int num = Integer.parseInt(st.nextToken());
                if(max<num){
                    max = num;
                    r = i;
                    c = j;
                }
            }
        }
        System.out.println(max + "\n" + r + " " + c);
    }
}
