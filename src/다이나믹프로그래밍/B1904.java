package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1904 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = getNumOfTile(n);
        System.out.println(result);
    }
    private static int getNumOfTile(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        int[] tiles = new int[n+1];
        tiles[1] = 1;
        tiles[2] = 2;
        for(int i = 3; i<=n;i++){
            tiles[i] = (tiles[i-2] + tiles[i-1])%15746;
        }
        return tiles[n];
    }
}
