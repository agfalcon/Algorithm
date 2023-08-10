package 문자열;

import java.io.*;
import java.util.Arrays;
public class B11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] nums = br.readLine().split("");
        System.out.println(Arrays.stream(nums).mapToInt(Integer::parseInt).sum());
    }
}
