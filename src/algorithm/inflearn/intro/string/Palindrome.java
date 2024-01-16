package algorithm.inflearn.intro.string;

import java.util.Scanner;

// // 1-8. 팰린드롬
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("[^A-Za-z]","");
        str = str.toLowerCase();
        String result = "YES";

        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                result ="NO";
                break;
            }
        }
        System.out.println(result);
    }


}
