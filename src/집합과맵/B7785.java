package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B7785 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashSet<String> employee = new HashSet<>();
        for(int i =0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();
            if(status.equals("enter")) employee.add(name);
            else employee.remove(name);
        }
        String[] list = employee.toArray(new String[0]);
        Arrays.sort(list, Collections.reverseOrder());
        StringBuffer sb = new StringBuffer();
        for(String name: list){
            sb.append(name).append("\n");
        }
        System.out.print(sb);
    }
}
