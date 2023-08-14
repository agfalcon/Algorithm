package 스택_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        String input;
        while(!(input=br.readLine()).equals(".")){
            boolean isVPS = true;
            for(int i=0;i<input.length();i++){
                char c = input.charAt(i);
                if(c=='[' || c=='(') stack.add(c);
                else if(c==']'){
                    if(stack.isEmpty() || stack.peek()!='[') {
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
                else if(c==')'){
                    if(stack.isEmpty() || stack.peek()!='('){
                        isVPS = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty() || !isVPS) sb.append("no");
            else sb.append("yes");
            sb.append("\n");
            stack.clear();
        }
        System.out.print(sb);
    }
}
