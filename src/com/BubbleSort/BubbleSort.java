package com.BubbleSort;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public void BubbleSort(int[] array){
        boolean isSorted;
        for(var j = 0;j < array.length;j++) {
            isSorted = true;
            for (var i = 1; i < array.length-j; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    isSorted = false;
                }
            }
            if(isSorted)
                return;
        }
    }
    private void swap(int[] array,int index1,int index2){
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
