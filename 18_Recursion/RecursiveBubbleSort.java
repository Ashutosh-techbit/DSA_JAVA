public class RecursiveBubbleSort {

    // Optimized recursive function to perform bubble sort
    static void bubbleSort(int[] arr, int n) {
        // Base case: If the size of the array is 1, it's already sorted
        if (n == 1) {
            return;
        }

        // Variable to track if any swap was made
        boolean swapped = false;

        // Perform one pass of the bubble sort for the current size n
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i + 1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true; // Mark that a swap was made
            }
        }

        // If no swap was made, the array is already sorted
        if (!swapped) {
            return;
        }

        // Recursive call to sort the remaining n-1 elements
        bubbleSort(arr, n - 1);
    }

    // Helper function to print the array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array:");
        printArray(arr);

        // Calling the optimized recursive bubble sort
        bubbleSort(arr, arr.length);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
