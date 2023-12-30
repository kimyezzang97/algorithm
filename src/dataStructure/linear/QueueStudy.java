package dataStructure.linear;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        Queue queue = new LinkedList(); // Queue는 인터페이스로 되어 있기 때문에 LinkedList로 생성한다.

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.poll()); // 하나 끄내기
        System.out.println(queue);

        System.out.println(queue.poll()); // 하나 끄내기
        System.out.println(queue);

        System.out.println(queue.peek()); // 하나 값 확인 하기
        System.out.println(queue);

        System.out.println(queue.contains(3));
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        queue.clear();
        System.out.println(queue);
        System.out.println(queue.poll()); // 없을 때는 null 출력

    }
}
