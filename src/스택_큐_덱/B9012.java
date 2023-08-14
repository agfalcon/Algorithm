package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<T;i++){
            String input = br.readLine();
            boolean isVPS = true;
            for(int j=0;j<input.length();j++){
                if(input.charAt(j)=='(') stack.add('(');
                else {
                    if(stack.isEmpty()) {
                        isVPS = false;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            if(!stack.isEmpty() || !isVPS) sb.append("NO");
            else sb.append("YES");
            sb.append("\n");
            stack.clear();
        }
        System.out.print(sb);
    }
}
