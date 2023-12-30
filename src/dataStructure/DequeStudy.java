package dataStructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStudy {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();

        // Front 부분 입력
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque); //[3, 2, 1]

        // Rear 부분 입력
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque); //[3, 2, 1, 10, 20, 30]

        // Front 부분 출력
        System.out.println(deque.removeFirst()); // 3
        System.out.println(deque); //[2, 1, 10, 20, 30]

        // Rear 부분 출력
        System.out.println(deque.removeLast()); // 30
        System.out.println(deque); // [2, 1, 10, 20]

        deque.clear();
        System.out.println(deque); // []

        System.out.println(deque.pollLast()); // null
        //System.out.println(deque.removeLast()); // error 발생
    }
}
