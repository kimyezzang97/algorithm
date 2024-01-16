package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1-9. 숫자만 추출
public class OnlyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for(char c : str.toCharArray()){
            if(Character.isDigit(c)) result += c;
        }
        System.out.println(Integer.parseInt(result));
    }
}
