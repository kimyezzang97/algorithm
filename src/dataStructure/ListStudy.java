package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListStudy {
    public static void main(String[] args) {

        // List
        // 1-1. ArrayList
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("arrayList : " + arrayList);

        arrayList.remove(Integer.valueOf(2)); // 그냥 2만 넣을 경우 인덱스 2번쨰가 삭제 된다.
        System.out.println("arrayList : " + arrayList);
        System.out.println("arrayList.size() : " + arrayList.size());
        System.out.println("arrayList.contains(1) : " + arrayList.contains(1));
        System.out.println("arrayList.indexOf(10) : " + arrayList.indexOf(10));

        // 1-2. LinkedList
        System.out.println("== LinkedList ==");
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println("LinkedList : " + linkedList);
        linkedList.addFirst(10); // arrayList와 다르게 list 맨앞, 맨뒤에 값을 넣을 수 있다.
        linkedList.addLast(20);
        System.out.println("LinkedList : " + linkedList);
        linkedList.remove(Integer.valueOf(1));
        System.out.println("linkedList : " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList : " + linkedList);

    }
}
