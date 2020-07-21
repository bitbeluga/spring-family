package com.example.demo;

import java.util.Arrays;

public class DemoArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int[] as={1,2,3,4,5,6}; //一旦創建不可修改大小。如果經常需要更改數組大小則可用ArrayList
        Arrays.sort(as);
        // for(int item : as)
        //     System.out.println(item);
        int[] ass = as;
        ass[0]=9;
        // 兩個變量引用了同一數組

        System.out.println(Arrays.toString(as));
        System.out.println(Arrays.toString(ass));

    }

}
