package 심화1;

import java.io.*;
public class B10988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuffer sb = new StringBuffer(input).reverse();
        if(input.contentEquals(sb)) System.out.println(1);
        else System.out.println(0);
    }
}
