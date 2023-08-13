package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B11478 {
    public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();
        String input = br.readLine();
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                set.add(input.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
