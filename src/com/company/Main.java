package com.company;

public class Main {

    public static void printTestCase(int[] test){
        System.out.println("Printing Original Test Case");
        for (int i =0; i< test.length; i++){
            System.out.print(test[i] + " ");
        }
        System.out.println();
    }

    public static void hIndexSol() {
        int[] test_case_1  = {1, 4, 1, 4, 2, 1, 3, 5, 6};
        int[] test_case_2 = {1, 1, 1};
        Hindex.solution(test_case_1);
    }

    public static void orderEvenSol() {
        int[] test_case_1  = {1, 4, 1, 4, 2, 1, 3, 5, 6};
        // int[] test_case_2 = {1, 1, 2};

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

    public static void bubbleAsc() {
        int[] test_case_1  = {1, 4, 1, 4, 2, 1, 3, 5, 6};
        System.out.println("Bubble Sort in Ascending Order");
        printTestCase(test_case_1);
        int[] getBubbleAns = Bubble.ascending(test_case_1);
        for (int i=0; i<getBubbleAns.length; i++){
            System.out.print(getBubbleAns[i] + " ");
        }
        System.out.println();
    }

    public static void selectionAsc() {
        int[] test_case_1  = {1, 4, 1, 4, 2, 1, 3, 5, 6};
        System.out.println("Selection Sort in Ascending Order");
        printTestCase(test_case_1);
        int[] getSelectAns = Selection.ascending(test_case_1);
        for (int i=0; i<getSelectAns.length; i++){
            System.out.print(getSelectAns[i] + " ");
        }
        System.out.println();
    }

    public static void insertionAsc() {
        int[] test_case_1  = {1, 4, 1, 4, 2, 1, 3, 5, 6};
        System.out.println("Insertion Sort in Ascending Order");
        printTestCase(test_case_1);
        int[] getInsertAns = Insertion.ascending(test_case_1);
        for (int i=0; i<getInsertAns.length; i++){
            System.out.print(getInsertAns[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // h-index solution
        // hIndexSol();

        // Bubble sort algorithm
        //bubbleAsc();

        // Order Even Odd
        // orderEvenSol();

        // Selection sort algorithm
        // selectionAsc();

        // Insertion sort algorithm
        insertionAsc();
    }
}
