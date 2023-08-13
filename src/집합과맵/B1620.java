package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int num = 1;
        HashMap<String, Integer> map = new HashMap<>();
        String[] list = new String[N+1];
        for(int i =0;i<N;i++){
            String poke = br.readLine();
            map.put(poke, num++);
            list[i+1] = poke;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<M;i++){
            String input = br.readLine();
            if(input.charAt(0)>='A' && input.charAt(0)<='Z'){
                sb.append(map.get(input)).append("\n");
            } else{
                sb.append(list[Integer.parseInt(input)]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
