package 기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10101 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r1 = Integer.parseInt(br.readLine());
        int r2 = Integer.parseInt(br.readLine());
        int r3 = Integer.parseInt(br.readLine());
        if(r1+r2+r3!=180) System.out.println("Error");
        else{
            if(r1==r2 && r1==r3) System.out.println("Equilateral");
            else if(r1!=r2 && r1!=r3 && r2!=r3) System.out.println("Scalene");
            else System.out.println("Isosceles");
        }
    }
}
