public class Pract_Day02 {
    public static int MissNo(int[] arr) {
        int n = arr.length + 1; 
        int Sum = n * (n + 1) / 2; 
        int Sum1 = 0;
        for (int num : arr) {
            Sum1 += num;
        }
        return Sum - Sum1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2,3,4, 5};
        int missingNumber = MissNo(arr);
        System.out.println("Missing Number: " + missingNumber); 
    }
}
