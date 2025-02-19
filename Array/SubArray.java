package Array;

public class SubArray {
    public static int maxSubArraySum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) { // Corrected loop condition
                    currSum += num[k];
                }
                if (currSum > maxSum) { // Fixed comparison condition
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(numbers));
    }
}
