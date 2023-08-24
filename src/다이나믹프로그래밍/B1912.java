package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1912 {

    private static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        getSum(arr);
        System.out.println(max);
    }

    private static void getSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(sum<0) sum = 0;
            sum+= arr[i];
            if(max < sum) max = sum;
        }
    }
}
