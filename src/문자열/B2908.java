package 문자열;

import java.io.*;
import java.util.StringTokenizer;
public class B2908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer n1 = new StringBuffer(st.nextToken()).reverse();
        StringBuffer n2 = new StringBuffer(st.nextToken()).reverse();
        if(n1.compareTo(n2)<0) System.out.println(n2);
        else System.out.println(n1);
    }
}
