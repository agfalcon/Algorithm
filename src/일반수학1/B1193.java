package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int level = 0;
        int slide = 1;
        while(num>0){
            num-=slide;
            slide++;
            level++;
        }
        num+=slide-1;
        if(level%2==0){
            System.out.println(num+"/"+(level+1-num));
        }else{
            System.out.println((level+1-num)+"/"+num);
        }
    }
}
