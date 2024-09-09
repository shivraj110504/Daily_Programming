public class Pract_Day01 {
    public static void sort(int[] arr) {
        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while (mid <= end) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, start, mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, end);
                    end--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 0};
        System.out.println("Original array: ");
        printArray(arr);

        sort(arr);

        System.out.println("Sorted array: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    
    }
}
