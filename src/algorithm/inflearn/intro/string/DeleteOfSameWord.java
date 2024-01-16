package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1-6. 중복 문자 제거
public class DeleteOfSameWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(result.indexOf(str.charAt(i) ) < 0) result += str.charAt(i);
        }
        System.out.println(result);
    }
}
