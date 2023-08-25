package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2156 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] drinks = new int[n];
        for(int i=0;i<n;i++){
            drinks[i] = Integer.parseInt(br.readLine());
        }
        int result = getMaxAmount(drinks);
        System.out.println(result);
    }

    private static int getMaxAmount(int[] drinks){
        int[] amount = new int[drinks.length];
        if(drinks.length==1) return drinks[0];
        else if(drinks.length==2) return drinks[0] + drinks[1];
        else{
            amount[0] = drinks[0];
            amount[1] = drinks[0] + drinks[1];
            amount[2] = Math.max(drinks[1], drinks[0]) + drinks[2];
            for(int i=3;i<amount.length;i++){
                int amount1;
                if(i>=4) amount1 = drinks[i-1] + Math.max(amount[i-3],amount[i-4]); else amount1 = drinks[i-1] + amount[i-3];
                int amount2 = amount[i-2];
                amount[i] = Math.max(amount1, amount2) + drinks[i];
            }
            return Math.max(amount[drinks.length-1], amount[drinks.length-2]);
        }
    }
}
