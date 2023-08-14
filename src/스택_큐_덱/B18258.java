package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B18258 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] queue = new int[2000000];
        int front = 0;
        int rear = -1;
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            switch (op){
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    queue[++rear] = n;
                    break;
                case "pop":
                    if(front>rear) sb.append(-1); else sb.append(queue[front++]);
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(rear-front+1).append("\n");
                    break;
                case "front":
                    if(front>rear) sb.append(-1); else sb.append(queue[front]);
                    sb.append("\n");
                    break;
                case "back":
                    if(front>rear) sb.append(-1); else sb.append(queue[rear]);
                    sb.append("\n");
                    break;
                case "empty":
                    if(front>rear) sb.append(1); else sb.append(0);
                    sb.append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }
}
