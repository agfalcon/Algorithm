package _1차원배열;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
public class B10807 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        System.out.println(Arrays.stream(arr).filter(i -> i==v).count());
    }
}
