package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class B12789 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            queue.add(Integer.parseInt(st.nextToken()));
        }
        for(int i=1;i<=N;i++){
            boolean isNice = true;
            while(!queue.isEmpty() && queue.peek()!=i && (stack.isEmpty() || stack.peek()!=i)){
                if(queue.isEmpty()){
                    isNice = false;
                    break;
                }
                stack.add(queue.poll());
            }
            if(!isNice){
                System.out.println("Sad");
                return;
            }
            if(!stack.isEmpty() && stack.peek()==i) stack.pop();
            else if(!queue.isEmpty() && queue.peek()==i) queue.poll();
            else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
