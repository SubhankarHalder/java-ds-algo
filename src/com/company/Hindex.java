package com.company;

import java.util.Arrays;

public class Hindex {
    // The h-index is a metric that measures both the productivity
    // and citation impact of a researcher.
    // A researcher's h-index is the largest number h such that
    // the researcher has published h papers that have
    // each been cited at least h times.
    //
    // Ex: If Carl has publish A,B,C,D,E,F,G,H,I
    // which have been cited 1,4,1,4,2,1,3,5,6 times respectively
    // then his h-index is 4 (corresponding to papers B,D,H,I)
    //
    // Problem: Determine a researcher's h-index
    // Input: Array of positive integers representing the citation
    // counts of each of the author's papers.
    public static void solution(int[] numbers){
        System.out.println("This is h-index solution");
        Arrays.sort(numbers);
        int cache = numbers[0];
        int len = numbers.length;
        for (int i = 0; i < len; i++){
            if (numbers[i] > len-i) {
                break;
            }
            else {
                cache = numbers[i];
            }
        }
        System.out.println("Researcher's h-index is: " + cache);
    }
}
