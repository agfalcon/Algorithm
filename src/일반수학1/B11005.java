package 일반수학1;

import java.io.*;
import java.util.StringTokenizer;
public class B11005 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int jin = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();
        while(num>0){
            char c = (char) ((num%jin<10) ? num%jin+'0' : (num%jin-10+'A'));
            sb.append(c);
            num/=jin;
        }
        System.out.println(sb.reverse());
    }
}
