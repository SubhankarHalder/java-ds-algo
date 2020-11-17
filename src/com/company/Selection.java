package com.company;

public class Selection {
    public static int[] ascending(int numbers[]){
        for (int i=0; i<numbers.length-1; i++){
            int min = numbers[i];
            boolean swap = false;
            int idxCache = i;
            for (int j=i+1; j<numbers.length; j++){
                if (numbers[j] < min){
                    min = numbers[j];
                    idxCache = j;
                    swap = true;
                }

            }
            if (swap){
                int temp = numbers[i];
                numbers[i] = min;
                numbers[idxCache] = temp;
            }
        }
        return numbers;
    }
}
