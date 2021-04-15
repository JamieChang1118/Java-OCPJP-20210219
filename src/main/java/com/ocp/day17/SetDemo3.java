package com.ocp.day17;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet
 * @author boddy
 */

public class SetDemo3 {
    public static void main(String[] args) {
        Set<Integer> tree = new TreeSet<>();
        tree.add(2);tree.add(7);tree.add(5);tree.add(8);tree.add(3);tree.add(4);tree.add(9);       
        System.out.println(tree);  // 自然排序
        // 子集
        TreeSet<Integer> tree2 = (TreeSet)tree;
        SortedSet<Integer> sub1 = tree2.subSet(5, 9);   // 不含9
        System.out.println(sub1);
        NavigableSet<Integer> sub2 = tree2.subSet(5, true, 9, true);    // 可決定是否包含5和9
        System.out.println(sub2);
        
    }
}
