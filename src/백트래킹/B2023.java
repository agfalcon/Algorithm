package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2023 {

    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        findInterestingSosu(N,0,N);
        System.out.print(sb);
    }

    private static void findInterestingSosu(int num, int level, int depth){
        if(level == depth){
            sb.append(num).append("\n");
            return;
        }
        if(level==0){
            for(int i=1;i<=9;i++){
                if(checkSosu(i)){
                    findInterestingSosu(i, level+1, depth);
                }
            }
        } else{
            num*=10;
            for(int i=0;i<=9;i++){
                num += i;
                if(checkSosu(num)){
                    findInterestingSosu(num, level+1, depth);
                }
                num -= i;
            }
        }
    }

    private static boolean checkSosu(int n){
        if(n==1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
