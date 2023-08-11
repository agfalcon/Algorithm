package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 1;
        int num = Integer.parseInt(br.readLine())-1;
        int roomNum = 6;
        while(num>0){
            num-=roomNum;
            result++;
            roomNum+=6;
        }
        System.out.println(result);
    }
}
