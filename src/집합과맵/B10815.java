package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<N;i++){
            int n = Integer.parseInt(st.nextToken());
            set.add(n);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<M;i++){
            int n = Integer.parseInt(st.nextToken());
            if(set.contains(n)) sb.append(1);
            else sb.append(0);
            sb.append(" ");
        }
        System.out.print(sb);
    }
}
