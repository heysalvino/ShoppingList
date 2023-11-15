# ShoppingList

Overview
This Java program, "Shopping Trip Optimizer", is designed to help optimize the time spent in a grocery store by minimizing the number of department visits. Given a list of products with their respective departments and a shopping list, the program calculates the time saved by reordering the shopping list so that all items from each department are bought together.

Features
Department-wise Shopping: Orders your shopping list by departments to minimize back and forth in the store.
Time Saving Calculation: Shows how many department visits you save with the optimized list.
Flexible Input: Works with any list of products and any shopping list.
How It Works
The program takes two inputs:

unsortedProducts: A 2D array of products and their corresponding departments.
shoppingList: An array of items you intend to buy.
It then reorders the shopping list by departments and calculates the number of department visits saved compared to buying items in the order they appear in your original list.

Example
Products:

java
Copy code
String[][] products = {
    {"Cheese", "Dairy"},
    {"Carrots", "Produce"},
    // more products...
};
Shopping List:

java
Copy code
String[] shoppingList = {"Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots"};
Usage
To use the program, compile and run the Solution class. You can modify the products and shoppingList variables in the main method to test different scenarios.

Output
The program outputs the time saved in terms of the number of department visits eliminated. For example:

css
Copy code
Time saved in terms of the department visits for list1: 2
Requirements
Java JDK 8 or higher
Basic understanding of Java programming
