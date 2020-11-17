package com.company;

public class Insertion {
    // Insertion Sort
    public static int[] ascending(int[] numbers) {
        for (int i=1; i<numbers.length; i++){
            int min = numbers[i];
            boolean sorted = false;
            int j = i;
            while (!sorted){
                if (numbers[j-1] > numbers[j]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
                else {
                    sorted = true;
                }
                j--;
            }
            //numbers[j+1] = min;

        }
        return numbers;
    }
}
