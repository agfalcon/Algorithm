package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B28278 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] stack = new int[1000001];
        int top = -1;
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());
            switch(op){
                case 1:
                    int X = Integer.parseInt(st.nextToken());
                    stack[++top] = X;
                    break;
                case 2:
                    if(top==-1) sb.append(-1).append("\n");
                    else sb.append(stack[top--]).append("\n");
                    break;
                case 3:
                    sb.append(top+1).append("\n");
                    break;
                case 4:
                    if(top==-1) sb.append(1); else sb.append(0);
                    sb.append("\n");
                    break;
                case 5:
                    if(top==-1) sb.append(-1); else sb.append(stack[top]);
                    sb.append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
