package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11053 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = getMaxLength(arr);
        System.out.println(result);
    }

    private static int getMaxLength(int[] arr){
        int[] answer = new int[1001];
        answer[arr[0]] = 1;
        int min = arr[0];
        int maxLength = 1;
        for(int i=1;i<arr.length;i++){
            if(min > arr[i]){
                answer[arr[i]] = 1;
                min = arr[i];
            }
            else if(min < arr[i]){
                int temp = 0;
                for(int j = arr[i]-1; j>=min;j--){
                    if(answer[j] > temp) temp = answer[j];
                }
                answer[arr[i]] = temp+1;
                if(maxLength < answer[arr[i]]) maxLength = answer[arr[i]];
            }
        }
        return maxLength;
    }
}
