package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class B1181 {
    public static void main(String[] args )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> word = new HashSet<>();
        for(int i=0;i<N;i++){
            word.add(br.readLine());
        }
        String[] wordList = word.toArray(new String[0]);
        Arrays.sort(wordList, (w1, w2)->{
            if(w1.length()==w2.length()){
                return w1.compareTo(w2);
            }else{
                return w1.length() - w2.length();
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<wordList.length;i++){
            sb.append(wordList[i]).append("\n");
        }
        System.out.print(sb);
    }
}
