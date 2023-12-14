package dataStructure;

import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {
        // TreeSet
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        System.out.println("treeSet : " + treeSet);
        treeSet.remove(2);
        System.out.println("treeSet : " + treeSet);
        treeSet.clear();
        System.out.println("treeSet : " + treeSet);

        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(15);

        System.out.println("treeSet : " + treeSet);
        System.out.println("treeSet.first() : " + treeSet.first());
        System.out.println("treeSet.last() : " + treeSet.last());
        System.out.println("treeSet.lower(10) : " + treeSet.lower(11));
        System.out.println("treeSet.higher(6) : " + treeSet.higher(6));





    }
}
