package com.example.algoritm;

public class SelectionSort {
    private int a;
    public static Integer[] sort(Integer[] array) {
        Integer[] newArray = new Integer[array.length];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            int smallest = findSmallest(array);
            newArray[index++] = array[smallest];
            array[smallest] = null;
        }
        return newArray;
    }


    public static Integer findSmallest(Integer[] array) {
        Integer smallest = Integer.MAX_VALUE;
        int smallest_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null && array[i] < smallest) {
                smallest = array[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }
}

