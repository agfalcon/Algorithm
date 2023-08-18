package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14888 {

    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    private static int[] operand;

    private static int[] op;

    private static int[] selectedOp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        operand = new int[N];
        op = new int[4];
        selectedOp = new int[N-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            operand[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            op[i] = Integer.parseInt(st.nextToken());
        }
        makePolynomials(0, N-1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void makePolynomials(int level, int depth){
        if(level==depth){
            int num = operand[0];
            for(int i=0;i<selectedOp.length;i++){
                if(selectedOp[i]==1){
                    num += operand[i+1];
                }
                else if(selectedOp[i]==2){
                    num -= operand[i+1];
                }
                else if(selectedOp[i]==3){
                    num *= operand[i+1];
                }
                else{
                    int n2 = operand[i+1];
                    if((num<0 && n2 >0) || (num>0 && n2 <0)){
                        num = Math.abs(num)/Math.abs(n2)*(-1);
                    }
                    else{
                        num = Math.abs(num)/Math.abs(n2);
                    }
                }
            }
            if(max < num) max = num;
            if(min > num) min = num;
            return;
        }
        for(int i=0;i<4;i++){
            if(op[i]!=0){
                selectedOp[level] = i+1;
                op[i]--;
                makePolynomials(level+1, depth);
                op[i]++;
            }
        }
    }
}
