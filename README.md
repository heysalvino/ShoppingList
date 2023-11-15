# Grocery Shopping Optimization

This Java program aims to help you optimize your grocery shopping by reducing the number of department visits required to purchase items from your shopping list. Instead of buying items in the order they appear on your list, the program arranges your shopping to minimize department visits. 

## Problem Description
You are going on a camping trip and need to buy groceries. You have an unsorted list of products with their respective departments and a shopping list. Your goal is to determine the time saved in terms of the number of department visits eliminated when optimizing your shopping list.

## Example
Suppose you have the following products and shopping lists:
```java
String[][] products = {
    // Product Name      Department
    {"Cheese",          "Dairy"},
    {"Carrots",         "Produce"},
    {"Potatoes",        "Produce"},
    {"Canned Tuna",     "Pantry"},
    {"Romaine Lettuce", "Produce"},
    {"Chocolate Milk",  "Dairy"},
    {"Flour",           "Pantry"},
    {"Iceberg Lettuce", "Produce"},
    {"Coffee",          "Pantry"},
    {"Pasta",           "Pantry"},
    {"Milk",            "Dairy"},
    {"Blueberries",     "Produce"},
    {"Pasta Sauce",     "Pantry"}
};

String[] shoppingList = {"Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots"};
```

If you buy items from `shoppingList` in order, it would take 5 department visits. However, using this program, you can reduce the visits to only 3 departments, saving 2 department visits:
```
Original: Produce(Blueberries)->Dairy(Milk)->Pantry(Coffee/Flour)->Dairy(Cheese)->Produce(Carrots) = 5 department visits
Optimized: Produce(Blueberries/Carrots)->Pantry(Coffee/Flour)->Dairy(Milk/Cheese) = 3 department visits
```

## Usage
To use this program, follow these steps:

1. Create a 2D array `products` that contains the product names and their respective departments.
2. Create a shopping list in the form of a string array.
3. Call the `shopping` method with `products` and the shopping list as parameters to calculate the time saved in terms of department visits.
4. The program will return the difference in department visits between the original order and the optimized order.

Example usage:
```java
public static void main(String[] argv) {
    // Define products and shopping lists
    String[][] products = { /* ... */ };
    String[] list1 = { /* ... */ };
    String[] list2 = { /* ... */ };

    // Calculate and print the time saved for different shopping lists
    int timeSavedList1 = shopping(products, list1);
    System.out.println("Time saved in terms of department visits for list1: " + timeSavedList1);

    int timeSavedList2 = shopping(products, list2);
    System.out.println("Time saved in terms of department visits for list2: " + timeSavedList2);

    // Add more test cases as needed
}
```

## Complexity
The complexity of the `shopping` method depends on the number of products, denoted as `n`:

- Populating the `productToDepartment` map takes O(n) time.
- Counting department visits in the original order takes O(n) time.
- Calculating optimized department visits takes O(n) time.

Overall, the time complexity of the `shopping` method is O(n).
