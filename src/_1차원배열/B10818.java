package _1차원배열;

import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class B10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.stream(arr).min().getAsInt() + " " + Arrays.stream(arr).max().getAsInt());
    }
}
