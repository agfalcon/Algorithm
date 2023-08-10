package 문자열;
import java.io.*;
public class B5622 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String call = br.readLine();
        int result = 0;
        for(int i=0;i<call.length();i++){
            char num = call.charAt(i);
            if(num>='W') result+=10;
            else if(num>='T') result += 9;
            else if(num>='P') result += 8;
            else if(num>='M') result += 7;
            else if(num>='J') result += 6;
            else if(num>='G') result += 5;
            else if(num>='D') result += 4;
            else result += 3;
        }
        System.out.println(result);
    }
}
