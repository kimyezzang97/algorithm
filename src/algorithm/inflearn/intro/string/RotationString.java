package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1-7. 회문 문자열
public class RotationString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.toUpperCase();

        String result = "YES";
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }
}
