package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B15649 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> selected = new ArrayList<>();
        for(int i=1;i<=N;i++){
            list.add(i);
        }
        StringBuilder sb = new StringBuilder();
        makeSequences(list, selected, 0, M, sb);
        System.out.print(sb);
    }

    private static void makeSequences(ArrayList<Integer> list, ArrayList<Integer> selected, int depth, int end, StringBuilder sb){
        if(depth==end){
            for(int i=0;i<selected.size();i++){
                sb.append(selected.get(i)).append(" ");
            }
            sb.append("\n");
            return;
        }
        int index =0;
        for(int i=0;i<list.size()-depth;i++){
            while(selected.contains(list.get(index))) index++;
            selected.add(list.get(index));
            makeSequences(list, selected, depth+1, end, sb);
            selected.remove(list.get(index));
            index++;
        }
    }
}
