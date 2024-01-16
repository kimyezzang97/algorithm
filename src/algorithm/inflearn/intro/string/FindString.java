package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1-1. 문자 찾기
public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        c = Character.toLowerCase(c);
        str = str.toLowerCase();
        int cnt = 0;
        for(char i : str.toCharArray()){
            if(i == c) cnt++;
        }
        System.out.println(cnt);
    }
}
