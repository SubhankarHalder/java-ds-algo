package com.company;

public class OrderEvenOdd {
    // Add code here
    public static int[] brute(int[] numbers){
        int[] backup = new int[numbers.length];
        int even = 0;
        int odd = numbers.length-1;
        for (int i=0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                backup[even] = numbers[i];
                even++;
            }
            else {
                backup[odd] = numbers[i];
                odd--;
            }
        }
        return backup;
    }
    // Space Complexity O(1)
    public static int[] space(int[] numbers){
        int nextEven = 0;
        int nextOdd = numbers.length -1;
        while (nextEven < nextOdd) {
            if (numbers[nextEven] % 2 == 0){
                nextEven++;
            }
            else {
                int temp = numbers[nextEven];
                numbers[nextEven] = numbers[nextOdd];
                numbers[nextOdd] = temp;
                nextOdd--;
            }

        }
        return numbers;
    }
}
