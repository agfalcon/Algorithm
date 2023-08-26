package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12865 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] luggage = new int[N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            luggage[i][0] = weight;
            luggage[i][1] = value;
        }
        int result = getMaxValue(K, luggage);
        System.out.println(result);
    }

    private static int getMaxValue(int k, int[][] luggage){
        int[] maxValue = new int[k+1];
        for(int i=0;i<luggage.length;i++){
            int weight = luggage[i][0];
            int value = luggage[i][1];
            int[] temp = new int[k+1];
            for(int j=weight;j<=k;j++){
                if(maxValue[j] < value + maxValue[j-weight]) temp[j] = value + maxValue[j-weight];
                else temp[j] = maxValue[j];
            }
            for(int j=weight;j<=k;j++){
                maxValue[j] = temp[j];
            }
        }
        return maxValue[k];
    }
}
