import java.util.ArrayList;

// class MenuItem: acts as a menu item object for a restauraunt menu, storing information about the items like name, ingredients, and cost

public class MenuItem {
   // instance variables
   private String name;
   private String course;
   private ArrayList<String> ingredients;
   private int timeToPrep;
   private double prodCost;
   private double retailCost;
   
   // constructors
   public MenuItem () {
      name = "Cheeseburger";
      course = "Entree";
      timeToPrep = 6;
      prodCost = 4.00;
      retailCost = 9.99;
      
      ingredients = new ArrayList<String>();
      ingredients.add("Bun");
      ingredients.add("Cheese");
      ingredients.add("Beef Patty");
      ingredients.add("Ketchup");
      ingredients.add("Mayonnaise");
      ingredients.add("Lettuce");
   }
   
   public MenuItem (String name, String course, int timeToPrep, double prodCost, double retailCost) {
      this.name = name;
      this.course = course;
      this.timeToPrep = timeToPrep;
      this.prodCost = prodCost;
      this.retailCost = retailCost;
      
      ingredients = new ArrayList<String>();
   }
   
   // methods
   // adds an ingredient to the ingredients list
   public void addIngredient(String item) {
      ingredients.add(item);
   }
   
   // removes an ingredient from the ingredients list
   public void remIngredient(String item) {
      
      ingredients.remove(item);
   }
   
   // lists all ingredients in the ingredient list, returned as a string
   public String listIngredients() {
      String result = "";
      for (String item : ingredients) {
         result += item + ", ";
      }
      return result;
   }
   
   // lists metadata to print on the menu, returned as a string
   public String getMetadata() {
      String result = "";
      return result;
   }
}