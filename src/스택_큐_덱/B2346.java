package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B2346 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            deque.add(i);
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuffer sb= new StringBuffer();
        sb.append(deque.pollFirst()).append(" ");
        int next = arr[1];
        while(deque.size()!=0){
            if(next<0) {
                next = -next;
                for (int i = 0; i < next - 1; i++) {
                    deque.addFirst(deque.pollLast());
                }
                int num = deque.pollLast();
                next = arr[num];
                sb.append(num).append(" ");
            }
            else{
                for (int i = 0; i < next - 1; i++) {
                    deque.addLast(deque.pollFirst());
                }
                int num = deque.pollFirst();
                next = arr[num];
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb);
    }
}
