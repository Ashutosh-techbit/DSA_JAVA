public class RecursiveSelectionSort {

    // Recursive function to perform selection sort
    static void selectionSort(int[] arr, int startIndex) {
        int n = arr.length;

        // Base case: If the startIndex is the last element, sorting is done
        if (startIndex >= n - 1) {
            return;
        }

        // Find the minimum element in the unsorted part of the array
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < n; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap the found minimum element with the first unsorted element
        if (minIndex != startIndex) {
            int temp = arr[minIndex];
            arr[minIndex] = arr[startIndex];
            arr[startIndex] = temp;
        }

        // Recursive call to sort the rest of the array
        selectionSort(arr, startIndex + 1);
    }

    // Helper function to print the array
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(arr);

        // Calling the optimized recursive selection sort
        selectionSort(arr, 0);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
