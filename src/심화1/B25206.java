package 심화1;

import java.io.*;
import java.util.StringTokenizer;
public class B25206 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double score = 0.0;
        double total = 0.0;
        for(int i=0;i<20;i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            double hak = Double.parseDouble(st.nextToken());
            String rank = st.nextToken();
            switch(rank){
                case "P":
                    break;
                case "F":
                    total+=hak;
                    break;
                case "A+":
                    total+= hak;
                    score+=4.5*hak;
                    break;
                case "A0":
                    total+= hak;
                    score+=4.0*hak;
                    break;
                case "B+":
                    total+= hak;
                    score+=3.5*hak;
                    break;
                case "B0":
                    total+= hak;
                    score+=3.0*hak;
                    break;
                case "C+":
                    total+= hak;
                    score+=2.5*hak;
                    break;
                case "C0":
                    total+= hak;
                    score+=2.0*hak;
                    break;
                case "D+":
                    total+= hak;
                    score+=1.5*hak;
                    break;
                case "D0":
                    total+= hak;
                    score+= hak;
                    break;
            }
        }
        System.out.println(score/total);
    }
}
