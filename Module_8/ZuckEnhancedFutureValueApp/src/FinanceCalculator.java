/* Zuck, C. (2022). CIS 505 Intermediate Java Programming. Bellevue University.*/

public class FinanceCalculator { /* Begin FinanceCalculator Class. */
    /* This sets the variable to 12 as a constant. */
    private static int MONTHS_IN_YEAR = 12;

    /* This method calculates the futureValue based on the arguments it takes. */
    public static double calculateFutureValue(double monthlyPayment, double rate, int years){
        int months = years * MONTHS_IN_YEAR;
        double presentValue = monthlyPayment * months;
        double interestRate = (1+rate/100);
        double futureValue = presentValue * (Math.pow(interestRate,months));
        return futureValue;
    } /* End calculateFutureValue method. */
} /* End FinanceCalculator class. */