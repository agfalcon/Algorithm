package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B20920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            String word = br.readLine();
            if(word.length()<M) continue;
            int num = map.getOrDefault(word, 0);
            map.put(word, num+1);
            if(num==0) list.add(word);
        }
        Collections.sort(list, (word1, word2) -> {
            if(map.get(word1)!=map.get(word2)){
                return map.get(word2) - map.get(word1);
            }
            else if(word1.length()!=word2.length()){
                return word2.length() - word1.length();
            }
            else {
                return word1.compareTo(word2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i)).append("\n");
        }
        System.out.print(sb);
    }
}
