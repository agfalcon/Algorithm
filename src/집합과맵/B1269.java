package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B1269 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n1;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n2;i++){
            int n = Integer.parseInt(st.nextToken());
            if(set.contains(n)) set.remove(n);
            else set.add(n);
        }
        System.out.println(set.size());
    }
}
