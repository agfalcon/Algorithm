package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2503 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i=123;i<=987;i++){
            int n1 = i%10;
            int n2 = i/10%10;
            int n3 = i/100;
            if(n1==0 || n2==0 || n3==0) continue;
            if(n1 != n2 && n2 != n3 && n1 != n3) list.add(String.valueOf(i));
        }
        int N  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            int index = 0;
            while(index<list.size()){
                int[] result = getStrikeBall(num, list.get(index));
                if(result[0] != strike || result[1] != ball) {
                    list.remove(list.get(index));
                    continue;
                }
                index++;
            }
        }
        System.out.println(list.size());
    }

    private static int[] getStrikeBall(String num1, String num2){
        int strike = 0;
        int ball = 0;
        for(int i=0;i<3;i++){
            if(num1.charAt(i) == num2.charAt(i)) strike++;
            if(num2.contains(num1.charAt(i)+"")) ball++;
        }
        ball-=strike;
        return new int[] {strike, ball};
    }
}
