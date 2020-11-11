package com.company;

public class Main {

    public static void hIndexSol() {
        int[] test_case_1  = {1, 4, 1, 4, 2, 1, 3, 5, 6};
        int[] test_case_2 = {1, 1, 1};
        Hindex.solution(test_case_1);
    }

    public static void orderEvenSol() {
        int[] test_case_1  = {1, 4, 1, 4, 2, 1, 3, 5, 6};
        // int[] test_case_2 = {1, 1, 1};

        System.out.println("Printing Original Test Case");
        for (int i =0; i< test_case_1.length; i++){
            System.out.print(test_case_1[i] + " ");
        }
        System.out.println();

        int [] get_answer = OrderEvenOdd.brute(test_case_1);
        System.out.println("Printing Reordered Array with Even first");
        for (int j=0; j < get_answer.length; j++){
            System.out.print(get_answer[j] + " ");
        }
        System.out.println();

        System.out.println("Space Complexity 1:");
        get_answer = OrderEvenOdd.space(test_case_1);
        System.out.println("Printing Reordered Array with Even first");
        for (int j=0; j < get_answer.length; j++){
            System.out.print(get_answer[j] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // h-index solution
        hIndexSol();
        // Bubble sort algorithm
        // Order Even Odd
        orderEvenSol();

    }
}
