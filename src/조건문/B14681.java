package 조건문;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class B14681 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int result;
        if(x>0 && y>0) result = 1;
        else if(x < 0 && y > 0) result = 2;
        else if(y < 0 && x > 0 ) result = 4;
        else result = 3;
        System.out.println(result);
    }
}
