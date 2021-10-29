/*
    Java program to sort the given list of numbers using bubbleSort

    Bubble Sort is the simplest sorting algorithm that works by repeatedly 
    swapping the adjacent elements if they are in wrong order. This is done 
    recursively until all the elemnts in the list are in the right order.
*/

import java.util.Scanner;

public class bubblesort {

    // bubblesort function to implement bubbleSort
    static void bubbleSort(int arr[]) {
        int n = arr.length;

        // loop till it iterates n times
        for (int i = 0; i < n - 1; i++)

            // iterate through all the elements of the array
            for (int j = 0; j < n - i - 1; j++)

                // swap the elements if the next element is greater than the current one.
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /*
     * This works all the time but it goes through all the elements in a particular
     * iteration even though no swapping occurs in that iteration, so it takes n^2
     * time to perform the sorting. To overcome this we can add a flag so that it
     * goes to the next iteration if no swapping occurs.
     * 
     * static void bubbleSort(int arr[]) {
     *    int n = arr.length;
     *    int i, j, temp; 
     *    boolean swapped;
     *    for (i = 0; i < n - 1; i++) { 
     * 
     *       swapped = false; 
     * 
     *       for (j = 0; j < n - i - 1;j++) { 
     *           if (arr[j] > arr[j + 1]) { 
     *               temp = arr[j];
     *               arr[j] = arr[j + 1];
     *               arr[j + 1] = temp; 
     *               swapped = true; 
     *           } 
     *       }
     * 
     * // IF no two elements were swapped by inner loop, then break 
     *     if (swapped == false) 
     *          break; 
     *   }    
     * }
     */

    public static void main(String args[]) {
        int arr[] = new int[5];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);

        // get the input from the user. ie 5 numbers and insert it to the array
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(arr);

        // display the sorted array
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }
}