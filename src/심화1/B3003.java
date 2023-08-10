package 심화1;

import java.io.*;
import java.util.StringTokenizer;

public class B3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[]{1, 1, 2, 2, 2, 8};
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<arr.length;i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(arr[i]-num).append(" ");
        }
        System.out.println(sb);
    }
}
