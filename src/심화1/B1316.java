package 심화1;

import java.io.*;
public class B1316 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i=0;i<T;i++){
            String input = br.readLine();
            boolean[] alpha = new boolean[26];
            boolean isGroup = true;
            for(int j=0;j<input.length();j++){
                char c = input.charAt(j);
                if(alpha[c-'a'] && input.charAt(j-1)!=c) {
                    isGroup=false;
                    break;
                }
                else{
                    alpha[c-'a']=true;
                }
            }
            if(isGroup) result++;
        }
        System.out.println(result);
    }
}
