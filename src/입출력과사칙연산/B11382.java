package 입출력과사칙연산;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11382 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long num1 = Long.parseLong(st.nextToken());
        Long num2 = Long.parseLong(st.nextToken());
        Long num3 = Long.parseLong(st.nextToken());
        System.out.println(num1 + num2 + num3);
    }
}
