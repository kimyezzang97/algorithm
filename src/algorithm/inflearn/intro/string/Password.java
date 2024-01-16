package algorithm.inflearn.intro.string;

import java.util.Scanner;

// 1-12. 암호
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        String result = "";
        str = str.replace("#", "1").replace("*","0");
        int cnt=0;
        for(int i=0; i<size; i++){
            String tempStr = str.substring(0, 7);
            result += (char) Integer.parseInt(tempStr, 2);
            cnt++;
            str = str.substring(7);
        }
        if(cnt != size) result += (char) Integer.parseInt(str, 2);
        System.out.println(result);
    }
}

/**
 * [input]
 * 4
 * #****###**#####**#####**##**
 *
 * [output] : COOL
 */
