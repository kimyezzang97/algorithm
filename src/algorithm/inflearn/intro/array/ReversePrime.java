package algorithm.inflearn.intro.array;

import java.util.Scanner;

// 2-6. 뒤집은 소수
public class ReversePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<cnt; i++){
            String str = "";
            str += arr[i];
            StringBuilder sb = new StringBuilder(str);
            int num = Integer.parseInt(sb.reverse().toString());
            int chk = 0;
            for(int j=2; j<=num; j++){
                if(chk > 1) break;
                if(num % j == 0) chk++;
            }
            if(chk == 1) System.out.print(num);
            if(i != cnt-1 && chk == 1) System.out.print(" ");
        }
    }
}
