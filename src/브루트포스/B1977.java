package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1977 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        int sum = 0;
        int index = 1;
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        while(index*index<=end){
            if(index*index>=start){
                if(sum==0) min = index*index;
                sum += index*index;
            }
            index++;
        }
        if(sum==0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
