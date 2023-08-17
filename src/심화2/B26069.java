package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B26069 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> dance = new HashSet<>();
        dance.add("ChongChong");
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String u1 = st.nextToken();
            String u2 = st.nextToken();
            if(dance.contains(u1) || dance.contains(u2)){
                dance.add(u1);
                dance.add(u2);
            }
        }
        System.out.println(dance.size());
    }
}
