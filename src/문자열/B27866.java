package 문자열;

import java.io.*;
public class B27866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int index = Integer.parseInt(br.readLine())-1;
        System.out.println(input.charAt(index));
    }
}
