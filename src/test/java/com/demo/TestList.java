package com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2020/10/2 9:17
 */
public class TestList {
    public static List<Integer> list = new ArrayList<>();
    public static List<Integer> list2 = new ArrayList<>();

    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list2.add(0);

        if (list.contains(2))
            System.out.println("1包含2");
        else
            System.out.println("没值");
    }
}
