package com.kiranthepro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int maxMirrorLength = 0;
        ArrayList<int[]> numbers = new ArrayList<int[]>();
        numbers.add(new int[]{1, 2, 3, 8, 9, 3, 2, 1});

        for (int i = 0; i < numbers.size(); i++) {
            // loop through numbers
//            if (scanForMirror(i) > maxMirrorLength) {
//                maxMirrorLength++;
//            }
            for (int j = 0; j < numbers.size(); j++) {
                // loop through numbers starting from i
                scanForMirror(numbers, i, j);
            }
        }
    }

    private static void scanForMirror(ArrayList<int[]> numbers, int start, int end) {
        List mirrorSection = numbers.subList(start, end);
//        Collections.reverse(mirrorSection);
        System.out.println(mirrorSection.toString());
    }
}
