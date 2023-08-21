package 브루트포스;

public class B4673 {
    public static void main(String[] args){
        boolean[] selfNumber = new boolean[10001];
        for(int i=1;i< selfNumber.length;i++){
            if(selfNumber[i]) continue;
            int num = i;
            while(true){
                num = makeNextNum(num);
                if(num>=selfNumber.length) break;
                if(selfNumber[num]) break;
                selfNumber[num] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1;i< selfNumber.length;i++){
            if(!selfNumber[i]) sb.append(i).append("\n");
        }
        System.out.print(sb);
    }

    private static int makeNextNum(int num){
        int temp = num;
        while(temp>0){
            num += temp%10;
            temp/=10;
        }
        return num;
    }
}
