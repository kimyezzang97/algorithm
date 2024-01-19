package algorithm.inflearn.intro.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 6-7. 좌표 정렬

class Point implements Comparable<Point>{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o){
        if(this.x==o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}
public class CoordinateSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for(int i=0; i<size; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }
        Collections.sort(list);
        // 내림차순 : Collections.sort(list, Collections.reverseOrder());
        for(Point o : list) System.out.println(o.x + " " +o.y);
    }
}
