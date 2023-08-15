package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14501 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st;
        for(int i=0;i<arr.length;i++){
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int pay = Integer.parseInt(st.nextToken());
            arr[i][0] = day;
            arr[i][1] = pay;
        }
        System.out.println(getPay(arr, 1,  N+1));
    }

    private static int getPay(int[][] arr, int day, int end){
        if(day==end) return 0;
        if(day + arr[day-1][0] > end){
            return getPay(arr, day+1, end);
        }
        else{
            int selectDay = arr[day-1][1] + getPay(arr, day+arr[day-1][0], end);
            int notSelectDay = getPay(arr, day+1, end);
            return Math.max(selectDay, notSelectDay);
        }
    }
}
