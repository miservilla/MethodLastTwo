package com.company;

public class Main {

    public static void main(String[] args) {
        int result = squareOddHalveEven(3);
        System.out.println(result);
        double total = calculatePayment(120,.32);
        System.out.println(total);
    }

    /**
     * A method to either divide by 2 an even number, or square an odd number.
     * @param x, the integer to test.
     * @return result, either the quotient or product of the method.
     */
    public static int squareOddHalveEven(int x){
        int result;
        if (x % 2 == 0){
            result = x / 2;
        } else result = x * x;
        return result;
    }

    /**
     * This method calculates total cost of meal including calculated tip.
     * Meal must be > 0 and tip must be > 0 and 0.5 or less.
     * @param meal, the cost of the meal
     * @param tip, the tip.
     * @return total, the sum of tip and meal. Will return
     * -1.0 if meal is < 1 or 0.5 < tip <= 0.
     */
    public static double calculatePayment(int meal, double tip){
        double total;
        if ((meal <= 0) || (tip <= 0 || tip > 0.5)){
            total = -1;
            return total;
        }
        total = meal * tip + meal;
        return total;
    }


}
