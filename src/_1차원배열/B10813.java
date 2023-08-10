package _1차원배열;

import java.io.*;
import java.util.StringTokenizer;
public class B10813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for(int i =0 ;i<N;i++){
            basket[i] = i+1;
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            swap(basket, n1-1, n2-1);
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<N;i++){
            sb.append(basket[i]).append(" ");
        }
        System.out.println(sb);
    }

    private static void swap(int[] basket, int n1, int n2){
        int temp = basket[n1];
        basket[n1] = basket[n2];
        basket[n2] = temp;
    }
}
