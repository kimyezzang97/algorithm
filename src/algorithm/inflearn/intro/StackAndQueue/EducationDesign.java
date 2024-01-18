package algorithm.inflearn.intro.StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 5-7. 교육과정 설계
public class EducationDesign {
    public static void main(String[] args) {
        String answer = "YES";
        Scanner sc = new Scanner(System.in);
        String must = sc.next();
        String str = sc.next();

        Queue<Character> mustQ = new LinkedList<>();
        for(char c : must.toCharArray()){
            mustQ.add(c);
        }

        for(char c : str.toCharArray()){
            if(!mustQ.isEmpty()){
                if(mustQ.peek() == c){
                    mustQ.poll();
                }
            }
        }
        if(!mustQ.isEmpty()) answer = "NO";

        System.out.println(answer);

    }
}
