public class CoinChange {

    // Method to calculate and print the denominations needed for the given amount
    public static void coinChange(int amount) {
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1}; // Available denominations
        int[] counts = new int[denominations.length]; // Array to store the count of each denomination

        // Loop through each denomination
        for (int i = 0; i < denominations.length; i++) {
            counts[i] = amount / denominations[i]; // Calculate the count of the current denomination
            amount %= denominations[i]; // Update the amount to the remaining amount
        }

        // Print the denominations used
        System.out.println("Denominations for Rs. " + amount + ":");
        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] > 0) {
                System.out.println(counts[i] + " x Rs. " + denominations[i]); // Print the count and denomination
            }
        }
    }

    public static void main(String[] args) {
        int amount = 1988; // Amount to be changed
        System.out.println("Amount: " + amount);
        coinChange(amount); // Call the method to get the denominations
    }
}
