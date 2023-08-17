package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B25192 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> user = new HashSet<>();
        int result =0;
        for(int i=0;i<N;i++){
            String chat = br.readLine();
            if(chat.equals("ENTER")) user.clear();
            else if(user.contains(chat)) continue;
            else {
                user.add(chat);
                result++;
            }
        }
        System.out.println(result);
    }
}
