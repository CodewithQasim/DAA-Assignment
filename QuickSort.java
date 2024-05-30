public class QuickSort {

    // Main method to perform quicksort on the array
    static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index
            int p = partition(arr, low, high);
            // Recursively sort elements before partition and after partition
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }

    // Method to swap two elements in the array
    static void swap(int[] arr, int low, int pivot) {
        int tmp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = tmp;
    }

    // Method to find the partition position
    static int partition(int[] arr, int low, int high) {
        // Select the pivot element
        int p = low, j;
        // Reorder the array by moving elements smaller than the pivot to the left
        for (j = low + 1; j <= high; j++)
            if (arr[j] < arr[low])
                swap(arr, ++p, j);

        // Place the pivot element in its correct position
        swap(arr, low, p);
        return p; // Return the partition index
    }

    // Method to print the array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 1, 3, 5, 6, 4};
        // Sorting the whole array using quicksort
        quicksort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr); // Print the sorted array
    }
}

