package 문자열;

import java.io.*;

public class B11718 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String input;
        while((input=br.readLine())!=null){
            sb.append(input).append("\n");
        }
        System.out.print(sb);
    }
}
