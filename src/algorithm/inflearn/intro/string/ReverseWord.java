package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1.4 단어 뒤집기
public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String[] arr = new String[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = sc.next();
        }
        for(String s : arr){
            StringBuilder sb = new StringBuilder(s);
            System.out.println(sb.reverse());
        }
    }
}
