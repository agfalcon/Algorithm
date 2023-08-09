package 반복문;

import java.io.*;

public class B25314 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())/4;
        String result = "";
        for(int i=0;i<N;i++){
            result += "long ";
        }
        System.out.println(result + "int");
    }
}
