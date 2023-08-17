package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25501 {
    private static int num = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            String word = br.readLine();
            num =0;
            int result = isPalindrome(word);
            sb.append(result).append(" ").append(num).append("\n");
        }
        System.out.print(sb);
    }

    private static int isPalindrome(String word){
        return recursion(word, 0, word.length()-1);
    }

    private static int recursion(String word, int l, int r){
        num++;
        if(l>=r) return 1;
        else if(word.charAt(l) != word.charAt(r)) return 0;
        else return recursion(word, l+1, r-1);
    }
}

