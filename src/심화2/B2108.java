package 심화2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class B2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+= arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            int num = map.get(arr[i]);
            if(max < num){
                max = num;
                list.clear();
                list.add(arr[i]);
            }
            else if(max == num){
                list.add(arr[i]);
            }
        }
        Arrays.sort(arr);
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(Math.round((double)sum/N)).append("\n");
        sb.append(arr[arr.length/2]).append("\n");
        if(list.size()==1)
            sb.append(list.get(0)).append("\n");
        else
            sb.append(list.get(1)).append("\n");
        sb.append(arr[arr.length-1]-arr[0]).append("\n");
        System.out.print(sb);
    }
}
