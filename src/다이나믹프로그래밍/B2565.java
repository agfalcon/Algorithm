package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2565 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] line = new int[N][2];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            line[i][0] = n1;
            line[i][1] = n2;
        }
        Arrays.sort(line, (l1, l2) ->{
            return l1[0] - l2[0];
        });
        int[] num = new int[N];
        int max = 0;
        for(int i=0;i<num.length;i++){
            num[i] = 1;
            for(int j=0;j<i;j++){
                if(line[j][0] < line[i][0] && line[j][1] < line[i][1]){
                    num[i] = Math.max(num[i], num[j] +1);
                }
            }
            if(max < num[i]) max = num[i];
        }
        System.out.println(N-max);
    }
}
