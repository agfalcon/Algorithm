package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B1107 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        int channel = 100;
        int result = Math.abs(num-channel);
        if(M!=0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<M;i++){
                set.add(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i=0;i<=1000000;i++){
            boolean isValid = true;
            int temp = i;
            int click = 0;
            while(temp>0){
                if(set.contains(temp%10)){
                    isValid = false;
                    break;
                }
                temp/=10;
                click++;
            }
            if(i==0) {
                if(set.contains(0)) continue;
                click = 1;
            }
            if(!isValid) continue;
            int resultClick = click + Math.abs(i-num);
            if(result > resultClick) result = resultClick;
        }
        System.out.println(result);
    }
}
