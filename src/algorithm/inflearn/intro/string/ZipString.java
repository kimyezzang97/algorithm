package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1-11. 문자열 압축
public class ZipString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        char beforeC = '0';
        int cnt = 1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == beforeC) cnt++;
            else {
                if(cnt != 1) result += cnt;
                result += str.charAt(i);
                beforeC = str.charAt(i);
                cnt = 1;
            }
        }
        if(cnt !=1) result += cnt;
        System.out.println(result);
    }
}
