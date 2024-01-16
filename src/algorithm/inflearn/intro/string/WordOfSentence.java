package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1.3 문장 속 단어
// 가장 긴 단어 출력
public class WordOfSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int length = 0;
        String result = "";
        for(String s : arr){
            if(length < s.length()){
                length = s.length();
                result = s;
            }
        }
        System.out.println(result);
    }
}
