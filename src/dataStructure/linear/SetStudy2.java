package dataStructure.linear;

import java.util.HashSet;
import java.util.Objects;

// 프로그래머스 강의 - HashSet
class MyData{
    int v;

    public MyData(int v){
        this.v = v;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "v=" + v +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return v == myData.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(v);
    }
}

public class SetStudy2 {
    public static void main(String[] args) {
        HashSet<MyData> list = new HashSet<>(); // hashCode와 equals를 오버라이딩 해줘야 중복을 체크할 수 있다.
        list.add(new MyData(1));
        list.add(new MyData(1));
        list.add(new MyData(1));

        System.out.println(list);

    }
}
