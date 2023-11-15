import java.io.*;
import java.util.*;
import javafx.util.Pair;

/*
You are going on a camping trip, but before you leave you need to buy groceries. To optimize your time spent in the store, instead of buying the items from your shopping list in order, you plan to buy everything you need from one department before moving to the next.

Given an unsorted list of products with their departments and a shopping list, return the time saved in terms of the number of department visits eliminated.

Example: 
products = [
    ["Cheese",          "Dairy"],
    ["Carrots",         "Produce"],
    ["Potatoes",        "Produce"],
    ["Canned Tuna",     "Pantry"],
    ["Romaine Lettuce", "Produce"],
    ["Chocolate Milk",  "Dairy"],
    ["Flour",           "Pantry"],
    ["Iceberg Lettuce", "Produce"],
    ["Coffee",          "Pantry"],
    ["Pasta",           "Pantry"],
    ["Milk",            "Dairy"],
    ["Blueberries",     "Produce"],
    ["Pasta Sauce",     "Pantry"]
]

list1 = ["Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots"]

For example, buying the items from list1 in order would take 5 department visits, whereas your method would lead to only visiting 3 departments, a difference of 2 departments.

Produce(Blueberries)->Dairy(Milk)->Pantry(Coffee/Flour)->Dairy(Cheese)->Produce(Carrots) = 5 department visits
New: Produce(Blueberries/Carrots)->Pantry(Coffee/Flour)->Dairy(Milk/Cheese) = 3 department visits

list2 = ["Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese"] => 2
list3 = ["Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce"] => 0
list4 = ["Milk", "Flour", "Chocolate Milk", "Pasta Sauce"] => 2
list5 = ["Cheese", "Potatoes", "Blueberries", "Canned Tuna"] => 0

All Test Cases:
shopping(products, list1) => 2
shopping(products, list2) => 2
shopping(products, list3) => 0
shopping(products, list4) => 2
shopping(products, list5) => 0

Complexity Variable:
n: number of products


*/



public class Solution {
    public static int shopping(String[][] unsortedProducts, String[] shoppingList) {
        Map<String, String> productToDepartment = new HashMap<>();
        Map<String, Integer> departmentFrequency = new HashMap<>();
        int originalDepartmentVisits = 0;
        int optimizedDepartmentVisits;

        // Populate the products/departments mapping
        for (String[] product : unsortedProducts) {
            if (product.length == 2) {
                productToDepartment.put(product[0], product[1]);
            }
        }

        // Count department visits in the original order
        String lastDepartment = "";
        for (String item : shoppingList) {
            String department = productToDepartment.get(item);
            if (department != null && !department.equals(lastDepartment)) {
                lastDepartment = department;
                originalDepartmentVisits++;
            }
            departmentFrequency.put(department, departmentFrequency.getOrDefault(department, 0) + 1);
        }

        // Calculate optimized department visits
        optimizedDepartmentVisits = departmentFrequency.size();

        // Return the difference in department visits
        return originalDepartmentVisits - optimizedDepartmentVisits;
    }
  
  public static void main(String[] argv) {
    
   String[][] products = {
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

    String[] list1 = {"Blueberries", "Milk", "Coffee", "Flour", "Cheese", "Carrots"};
    String[] list2 = {"Blueberries", "Carrots", "Coffee", "Milk", "Flour", "Cheese"};
    String[] list3 = {"Blueberries", "Carrots", "Romaine Lettuce", "Iceberg Lettuce"};
    String[] list4 = {"Milk", "Flour", "Chocolate Milk", "Pasta Sauce"};
    String[] list5 = {"Cheese", "Potatoes", "Blueberries", "Canned Tuna"};
   
   int timeSaved = shopping(products, list1);
   System.out.println("Time saved in terms of the department visits for list1: " + timeSaved);
   timeSaved = shopping(products, list2);
      System.out.println("Time saved in terms of the department visits for list2: " + timeSaved);
         timeSaved = shopping(products, list3);
      System.out.println("Time saved in terms of the department visits for list3: " + timeSaved);
         timeSaved = shopping(products, list4);
      System.out.println("Time saved in terms of the department visits for list4: " + timeSaved);
               timeSaved = shopping(products, list5);
      System.out.println("Time saved in terms of the department visits for list5: " + timeSaved);
  }
}
