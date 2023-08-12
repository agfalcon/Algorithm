package 기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14215 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l1 = Integer.parseInt(st.nextToken());
        int l2 = Integer.parseInt(st.nextToken());
        int l3 = Integer.parseInt(st.nextToken());
        int maxLength = Math.max(l1, Math.max(l2, l3));
        if(l1+l2+l3-maxLength <= maxLength) System.out.println((l1+l2+l3-maxLength)*2-1);
        else System.out.println(l1+l2+l3);
    }
}
