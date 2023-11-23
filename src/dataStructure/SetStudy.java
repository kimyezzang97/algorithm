package dataStructure;

import java.util.*;

class MySet { // Set 생성해보기1
    // ArrayList
    ArrayList<Integer> list;

    // 생성자 1
    MySet(){
        this.list = new ArrayList<Integer>();
    }

    // 생성자 2
    MySet(int[] arr){
        this.list = new ArrayList<Integer>();

        for(int item : arr){
            this.list.add(item);
        }
    }

    // 원소 추가 (중복 X)
    public void add(int x) {
        for(int item: this.list){
            if (item == x) {
                return;
            }
        }
        this.list.add(x);
    }

    // 교집합
    public MySet retainAll(MySet b){
        MySet result = new MySet();

        for(int itemA : this.list){
            for(int itemB : b.list){
                if(itemA == itemB){
                    result.add(itemA);
                }
            }
        }
        return result;
    }

    // 합집합
    public MySet addAll(MySet b){
        MySet result = new MySet();
        for(int itemA : this.list){
            result.add(itemA);
        }
        for(int itemB: b.list){
            result.add(itemB);
        }
        return result;
    }
    // 차집합
    public MySet removeAll(MySet b){
        MySet result = new MySet();

        for(int itemA : this.list){
            boolean containFlag = false;

            for(int itemB: b.list) {
                if(itemA == itemB){
                    containFlag = true;
                    break;
                }
            }
            if (!containFlag) {
                result.add(itemA);
            }
        }

        return result;
    }
}

public class SetStudy {
    public static void main(String[] args) {

        // 1. use set - HaseSet
        System.out.println("=== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        System.out.println("set1 : " + set1); // set1 : [1]

        set1.add(2);
        set1.add(3);
        System.out.println("set1 : " + set1); // set1 : [1, 2, 3]

        set1.remove(1);
        System.out.println("set1 : " + set1); // set1 : [2, 3]
        System.out.println("set1.size() : " + set1.size()); // set1.size() : 2
        System.out.println("set1.contains(2) : " + set1.contains(2)); // set1.contains(2) : true

        // 2. 집합 연산
        System.out.println(" === 집합 연산 ===");

        // 2-1. 교집합
        HashSet a = new HashSet(Arrays.asList(1,2,3,4,5));
        HashSet b = new HashSet(Arrays.asList(2,4,6,8,10));
        //a.retainAll(b);
        //System.out.println("교집합 : " + a); // 교집합 : [2, 4]

        // 2-2 합집합
        //a.addAll(b);
        //System.out.println("합집합 : " + a); // 합집합 : [2, 4, 6, 8, 10]

        // 2-3. 차집합
        a.removeAll(b);
        System.out.println("차집합 : " + a); // 차집합 : [1, 3, 5]


        System.out.println("========================");
        System.out.println("========================");
        System.out.println("==== custom set use ====");
        // 커스텀 set 사용 해보기
        MySet mySet = new MySet();

        mySet.add(1);
        mySet.add(1);
        mySet.add(1);
        System.out.println("Myset :" + mySet.list); // Myset :[1]
        mySet.add(2);
        mySet.add(3);
        System.out.println("Myset :" + mySet.list); // Myset :[1, 2, 3]

        mySet = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet mySet2 = new MySet(new int[]{2, 4, 6, 8, 10});
        MySet result = mySet.retainAll(mySet2);
        System.out.println("교집합 : " + result.list);

        result = mySet.addAll(mySet2);
        System.out.println("합집합 : " + result.list);

        result = mySet.removeAll(mySet2);
        System.out.println("차집합 : " + result.list);

    }

}
