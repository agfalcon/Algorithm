package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int point = 2;
        for(int i=0;i<N;i++){
            point = point * 2 -1;
        }
        System.out.println((int)Math.pow(point,2));
    }
}
