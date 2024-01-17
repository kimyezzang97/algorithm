package algorithm.inflearn.intro.HashMapAndTreeSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// 4-2. 아나그램 (해쉬)
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String result = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if(map.containsKey(c)) map.put(c,map.get(c) + 1);
            else map.put(c,1);
        }
        for(char c : str2.toCharArray()){
            if(map.containsKey(c)) map.put(c,map.get(c) -1);
            else map.put(c,1);
        }
        for(int i : map.values()){
            if(i>=1) result ="NO";
        }

        System.out.println(result);
    }
}
