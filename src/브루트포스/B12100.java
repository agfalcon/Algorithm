package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B12100 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        StringTokenizer st;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = getNum(arr, 0, 5);
        System.out.println(max);
    }

    private static int getNum(int[][] arr, int depth, int end){
        if(depth==end) {
            int max = -1;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(max < arr[i][j] ) max = arr[i][j];
                }
            }
            return max;
        }
        int leftNum = getNum(goLeft(arr), depth+1, end);
        int rightNum = getNum(goRight(arr), depth+1, end);
        int upNum = getNum(goUp(arr), depth+1, end);
        int downNum = getNum(goDown(arr), depth+1, end);
        return Math.max(Math.max(leftNum, rightNum), Math.max(upNum, downNum));
    }

    private static int[][] goLeft(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            int loc = 0;
            Stack<Integer> stack = new Stack<>();
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0) continue;
                if(stack.isEmpty()){
                    temp[i][loc] = arr[i][j];
                    stack.add(j);
                    loc++;
                }
                else{
                    if(arr[i][stack.peek()]==arr[i][j]){
                        temp[i][loc-1] *=2;
                        stack.pop();
                    }
                    else{
                        temp[i][loc] = arr[i][j];
                        stack.pop();
                        stack.add(j);
                        loc++;
                    }
                }
            }
        }
        return temp;
    }

    private static int[][] goRight(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            int loc = arr[i].length-1;
            Stack<Integer> stack = new Stack<>();
            for(int j=arr[i].length-1;j>=0;j--){
                if(arr[i][j]==0) continue;
                if(stack.isEmpty()){
                    temp[i][loc] = arr[i][j];
                    stack.add(j);
                    loc--;
                }
                else{
                    if(arr[i][stack.peek()]==arr[i][j]){
                        temp[i][loc+1] *=2;
                        stack.pop();
                    }
                    else{
                        temp[i][loc] = arr[i][j];
                        stack.pop();
                        stack.add(j);
                        loc--;
                    }
                }
            }
        }
        return temp;
    }

    private static int[][] goDown(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i=0;i<arr[0].length;i++){
            int loc = arr.length-1;
            Stack<Integer> stack = new Stack<>();
            for(int j=arr.length-1;j>=0;j--){
                if(arr[j][i]==0) continue;
                if(stack.isEmpty()){
                    temp[loc][i] = arr[j][i];
                    stack.add(j);
                    loc--;
                }
                else{
                    if(arr[stack.peek()][i]==arr[j][i]){
                        temp[loc+1][i] *=2;
                        stack.pop();
                    }
                    else{
                        temp[loc][i] = arr[j][i];
                        stack.pop();
                        stack.add(j);
                        loc--;
                    }
                }
            }
        }
        return temp;
    }

    private static int[][] goUp(int[][] arr){
        int[][] temp = new int[arr.length][arr[0].length];
        for(int i=0;i<arr[0].length;i++){
            int loc = 0;
            Stack<Integer> stack = new Stack<>();
            for(int j=0;j<arr.length;j++){
                if(arr[j][i]==0) continue;
                if(stack.isEmpty()){
                    temp[loc][i] = arr[j][i];
                    stack.add(j);
                    loc++;
                }
                else{
                    if(arr[stack.peek()][i]==arr[j][i]){
                        temp[loc-1][i] *=2;
                        stack.pop();
                    }
                    else{
                        temp[loc][i] = arr[j][i];
                        stack.pop();
                        stack.add(j);
                        loc++;
                    }
                }
            }
        }
        return temp;
    }
}
