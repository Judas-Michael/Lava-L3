package week_3;

import input.InputUtils;

import static input.InputUtils.*;

/**
 
 
 Refactor this program to make it less repetitive.
 
 Notice there are several drinks, and the code to get the total sales for each is very similar.
 Can you create and use another method (or methods) that will be called from the coffeeShop method,
 to make this program less repetitive?
 
 Hint: would an array of drink names help?
 Hint: create a method that takes the name of a drink as an argument. This method can calculate sales for that drink.
 
 The total lines of code in your program should get smaller. BUT, don't just delete lines,
 or compress more than one line together. Your code will be reviewed for clarity, readability, and logic.
 */


public class Question_4_Reduce_Repetition {


    // You don't need to modify this line
    public static void main(String[] args) {
        new Question_4_Reduce_Repetition().coffeeShop();
    }


    public void coffeeShop() {

        System.out.println("Coffee Shop Sales Calculator Program");

        double totalSales = 0;


        //created a preset array assuming these are the only drinks sold
        String[] coffeeDrinks = {"coffee","hot chocolate","tea", "cappuccino", "mocha"}; //could reformat to take drink suggestions from user input

        for (int i = 0; i < coffeeDrinks.length; i++){

            int cups = InputUtils.intInput("How many cups of " +coffeeDrinks[i] + " did you sell?");
            double price = InputUtils.doubleInput("How much does each cup of " + coffeeDrinks[i] + " cost?");
            double drinkSales = coffeeSales(cups, price);
            totalSales = totalSales + drinkSales;
        }

        String totalSalesString = String.format("%.2f", totalSales);
        
        System.out.println("Total sales for the day are $"  + totalSalesString); //prints total sales

    }
    public double coffeeSales(int cups, double price){ //method to calculate total sales

        double totalSales = cups*price;

        return totalSales;
    }
}

