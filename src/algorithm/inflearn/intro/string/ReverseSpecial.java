package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1.5 특정 문자 뒤집기
public class ReverseSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                while(!Character.isAlphabetic(str.charAt(str.length()-1-cnt))){
                    cnt++;
                }
                result += str.charAt(str.length()-1-cnt);
                cnt++;
            }
            else result += str.charAt(i);
        }
        System.out.println(result);
    }
}

//else if(Character.isAlphabetic(str.charAt(i))){
//                result += str.charAt(i-1);
//            }
//&& i<str.length()/2