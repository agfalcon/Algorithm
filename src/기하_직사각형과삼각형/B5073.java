package 기하_직사각형과삼각형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5073 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int l1 = Integer.parseInt(st.nextToken());
            int l2 = Integer.parseInt(st.nextToken());
            int l3 = Integer.parseInt(st.nextToken());
            if(l1==0 && l2==0 && l3==0) break;
            int maxLength = Math.max(l1, Math.max(l2, l3));
            if(l1+l2+l3-maxLength <= maxLength) sb.append("Invalid").append("\n");
            else if(l1 == l2 && l2 == l3 ) sb.append("Equilateral").append("\n");
            else if(l1 != l2 && l2 != l3 && l3 != l1) sb.append("Scalene").append("\n");
            else sb.append("Isosceles").append("\n");
        }
        System.out.print(sb);
    }
}
