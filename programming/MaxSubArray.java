
public class MaxSubArray {
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int maxEndingHere = 0;           // Tracks the sum of the current subarray

        for (int i = 0; i < arr.length; i++) {
            maxEndingHere += arr[i];

            // Update maxSoFar if maxEndingHere is greater
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }

            // If maxEndingHere becomes negative, reset it to 0
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is: " + maxSubArraySum(array));
    }
} 
