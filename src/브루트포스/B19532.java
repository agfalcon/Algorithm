package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B19532 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] solve = new int[6];
        for(int i=0;i<6;i++){
            solve[i] = Integer.parseInt(st.nextToken());
        }
        for(int x=-999; x<=999;x++){
            for(int y=-999; y<=999;y++){
                if(x*solve[0] + y*solve[1] == solve[2] && x*solve[3] + y*solve[4] == solve[5]){
                    System.out.println(x + " " + y);
                    return;
                }
            }
        }
    }
}
