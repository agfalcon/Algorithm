package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B28279 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] deque = new int[2000000];
        int front = 1000001;
        int rear = 1000000;
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int op= Integer.parseInt(st.nextToken());
            switch (op){
                case 1:
                    int n = Integer.parseInt(st.nextToken());
                    deque[--front] = n;
                    break;
                case 2:
                    int n2 = Integer.parseInt(st.nextToken());
                    deque[++rear] = n2;
                    break;
                case 3:
                    if(front>rear) sb.append(-1); else sb.append(deque[front++]);
                    sb.append("\n");
                    break;
                case 4:
                    if(front>rear) sb.append(-1); else sb.append(deque[rear--]);
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(rear-front+1).append("\n");
                    break;
                case 6:
                    if(front>rear) sb.append(1); else sb.append(0);
                    sb.append("\n");
                    break;
                case 7:
                    if(front>rear) sb.append(-1); else sb.append(deque[front]);
                    sb.append("\n");
                    break;
                case 8:
                    if(front>rear) sb.append(-1); else sb.append(deque[rear]);
                    sb.append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
