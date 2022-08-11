package com.company.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortByColor implements Comparator {
    public static void main(String[] args) {
        //Arrays.sort(args,com);
    }

    boolean com(int a, int b) {
        if(a < b) return true;
        else if(a == b) return true;
        else return false;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
