/**
 * Author: flex
 * Date: 03/10/2023
 */
public class LinerComplexityExample {
    // Linear complexity: O(n)
    public static int findSum(int[] array) {
        int sum = 0;

        // Iterate through the array and accumulate the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Find and print the sum of the array
        int sum = findSum(numbers);
        System.out.println("Sum of the array: " + sum);
    }

}
