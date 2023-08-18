package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4779 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringBuilder sb = new StringBuilder();
        while((input=br.readLine())!=null){
            int num = Integer.parseInt(input);
            String line = "-".repeat((int)Math.pow(3,num));
            String newLine = cantour(line);
            sb.append(newLine).append("\n");
        }
        System.out.print(sb);
    }

    private static String cantour(String line){
        if(line.length()==1){
            if(line.equals("-")) return "-";
            else return " ";
        }
        return cantour(line.substring(0, line.length()/3)) + line.substring(line.length()/3, line.length()/3*2).replace("-", " ") + cantour(line.substring(line.length()/3*2));
    }
}
