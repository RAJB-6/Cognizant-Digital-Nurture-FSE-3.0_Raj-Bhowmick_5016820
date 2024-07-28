import java.util.HashMap;

public class OptimizedFinancialFOrecasting {

    private static HashMap<Integer, Double> memo = new HashMap<>();

    /**
     * Calculates the future value recursively with memoization based on the present value, growth rate, and number of periods.
     * @param presentValue The present value.
     * @param growthRate The growth rate per period.
     * @param periods The number of periods into the future.
     * @return The future value.
     */
    public static double calculateFutureValue(double presentValue, double growthRate, int periods) {
        // Base case: if periods is 0, the future value is the present value
        if (periods == 0) {
            return presentValue;
        }

        // Check if the result is already in the memoization table
        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }

        // Recursive case: calculate the future value for one less period and apply the growth rate
        double futureValue = calculateFutureValue(presentValue, growthRate, periods - 1) * (1 + growthRate);
        
        // Store the result in the memoization table
        memo.put(periods, futureValue);

        return futureValue;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Example present value
        double growthRate = 0.05; // Example growth rate (5%)
        int periods = 10; // Example number of periods (10 years)

        double futureValue = calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("The future value after " + periods + " periods is: " + futureValue);
    }
}
