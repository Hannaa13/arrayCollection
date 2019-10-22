package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Array arr = new Array();

        arr.setArray(new String[]{"f", "e", "d", "a", "w"});
        System.out.println(Arrays.toString(arr.getArray()));
        System.out.println(Arrays.toString(arr.add("newElement")));
        System.out.println(arr.get(2));
        System.out.println(arr.containsForIndex(8));
        System.out.println(Arrays.toString(arr.clear()));
        System.out.println(arr.getSize());
        System.out.println(arr.find("a"));
        System.out.println(Arrays.toString(arr.delete("f")));
        System.out.println(arr.contains("w"));

        Array arr2 = new Array();
        arr2.setArray(new String[]{"f", "e", "q", "a", "w"});
        System.out.println(arr2.equals(arr));
    }

}
