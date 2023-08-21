package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                    if(sum>M) break;
                }
                if(sum==M) answer++;
                else if(sum>M) break;
                else if(j==N-1){
                    System.out.println(answer);
                    return;
                }
            }
        }
        System.out.println(answer);
    }
}
