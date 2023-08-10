package 일반수학1;

import java.io.*;
import java.util.StringTokenizer;
public class B2745 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        int num = Integer.parseInt(st.nextToken());
        int result = 0;
        for(int i=input.length()-1;i>=0;i--){
            char c = input.charAt(i);
            if(Character.isDigit(c)) result += (int) (Math.pow(num, input.length()-1-i) * (c-'0'));
            else result += (int) (Math.pow(num, input.length()-1-i) * (c-'A'+10));
        }
        System.out.println(result);
    }
}
