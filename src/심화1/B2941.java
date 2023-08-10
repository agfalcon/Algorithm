package 심화1;

import java.io.*;
public class B2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        String input = br.readLine();
        for(int i=0;i<input.length();i++){
            if(i==input.length()-1){
                result++;
                break;
            }
            char c = input.charAt(i);
            char next = input.charAt(i+1);
            if(c=='c' && (next=='=' || next=='-')) i++;
            else if(next=='=' && (c=='s' || c=='z')) i++;
            else if(next=='j' && (c=='l' || c=='n')) i++;
            else if(c == 'd' && next=='-') i++;
            else if(i<input.length()-2 && c== 'd' && next=='z' && input.charAt(i+2)=='=') i+=2;
            result++;
        }
        System.out.println(result);
    }
}
