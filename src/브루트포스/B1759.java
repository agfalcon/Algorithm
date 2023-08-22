package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PropertyResourceBundle;
import java.util.StringTokenizer;

public class B1759 {

    private static ArrayList<Character> parent = new ArrayList<>();
    private static ArrayList<Character> child = new ArrayList<>();
    private static char[] password;
    private static int maxParent;
    private static int maxChild;
    private static int currentParent = 0;
    private static int currentChild = 0;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<C;i++){
            String c = st.nextToken();
            if("aeiou".contains(c)){
                parent.add(c.charAt(0));
            }
            else{
                child.add(c.charAt(0));
            }
        }
        password = new char[L];
        maxChild = L-1;
        maxParent = L-2;
        Collections.sort(parent);
        Collections.sort(child);
        guessPassword(0, L);
        System.out.print(sb);
    }

    private static void guessPassword(int level, int depth){
        if(level == depth){
            for(int i=0;i<password.length;i++){
                sb.append(password[i]);
            }
            sb.append("\n");
            return;
        }
        int pIndex = 0;
        int cIndex = 0;
        while(pIndex<parent.size() || cIndex<child.size()){
            if(pIndex==parent.size() || (cIndex < child.size() && parent.get(pIndex) > child.get(cIndex))){
                if(currentChild==maxChild) {
                    cIndex++;
                    continue;
                }
                if(level>0 && password[level-1] >= child.get(cIndex)){
                    cIndex++;
                }
                else{
                    currentChild++;
                    password[level] = child.get(cIndex);
                    guessPassword(level+1, depth);
                    currentChild--;
                    cIndex++;
                }
            }
            else{
                if(currentParent==maxParent) {
                    pIndex++;
                    continue;
                }
                if(level>0 && password[level-1] >= parent.get(pIndex)){
                    pIndex++;
                }
                else{
                    currentParent++;
                    password[level] = parent.get(pIndex);
                    guessPassword(level+1, depth);
                    currentParent--;
                    pIndex++;
                }
            }
        }
    }
}
