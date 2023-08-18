package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24060 {

    private static int num = 0;
    private static int K;
    private static int answer= -1;
    private static int[] temp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        temp = arr.clone();
        mergeSort(arr, 0, N-1);
        System.out.println(answer);
    }

    private static void mergeSort(int[] arr, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end){
        int preIndex = start;
        int postIndex = mid+1;
        int index = start;
        while(preIndex<=mid && postIndex<=end){
            if(arr[preIndex] <= arr[postIndex]){
                temp[index] = arr[preIndex++];
            }
            else{
                temp[index] = arr[postIndex++];
            }
            index++;
        }
        while(preIndex<=mid){
            temp[index++] = arr[preIndex++];
        }
        while(postIndex<=end){
            temp[index++] = arr[postIndex++];
        }
        for(int i=start;i<=end;i++){
            arr[i] = temp[i];
            num++;
            if(num==K) answer = arr[i];
        }
    }
}
