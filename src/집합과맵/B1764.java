package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<N;i++){
            set.add(br.readLine());
        }
        StringBuffer sb = new StringBuffer();
        int result = 0;
        ArrayList<String> answer = new ArrayList<>();
        for(int i=0;i<M;i++){
            String input = br.readLine();
            if(set.contains(input)){
                result++;
                answer.add(input);
            }
        }
        Collections.sort(answer);
        for(String name: answer){
            sb.append(name).append("\n");
        }
        System.out.println(result);
        System.out.print(sb);
    }
}
