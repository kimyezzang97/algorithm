package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1-2. 대소문자 변환
public class ConversionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)) result += Character.toLowerCase(c);
            else result += Character.toUpperCase(c);
        }
        System.out.println(result);
    }
}
