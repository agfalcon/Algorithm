package 문자열;

import java.io.*;
public class B9086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<T;i++){
            String input = br.readLine();
            sb.append(input.charAt(0)).append(input.charAt(input.length()-1)).append("\n");
        }
        System.out.print(sb);
    }
}
