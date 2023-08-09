package 반복문;
import java.io.*;
import java.util.StringTokenizer;
public class B10951 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        String input;
        while((input = br.readLine())!=null){
            st = new StringTokenizer(input);
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            sb.append(n1+n2).append("\n");
        }
        System.out.print(sb);
    }
}
