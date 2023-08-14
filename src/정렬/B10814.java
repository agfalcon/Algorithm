package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String>[] list = new ArrayList[201];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            if(list[age]==null) list[age] = new ArrayList<>();
            list[age].add(name);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=200;i++){
            if(list[i]==null) continue;
            for(int j=0;j<list[i].size();j++){
                sb.append(i).append(" ").append(list[i].get(j)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
