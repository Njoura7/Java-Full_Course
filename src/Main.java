import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args){

        // 2D ArrayList ==> a dynamic list of lists
       //You can change the size of these lists during runtime


      ArrayList<ArrayList<String>> groceryList=new ArrayList<>();

      ArrayList<String> veggiesList = new ArrayList<>();
      veggiesList.add("tomatoes");
      veggiesList.add("peppers");
      veggiesList.add("onion");

      ArrayList<String> drinksList = new ArrayList<>();
      drinksList.add("code");
      drinksList.add("coffee");

      ArrayList<String> bakeryList = new ArrayList<>();
      bakeryList.add("pizza");

      //filling the groceryList
      groceryList.add(bakeryList);
      groceryList.add(veggiesList);
      groceryList.add(drinksList);

      System.out.println(drinksList);
      System.out.println(groceryList); //[[pizza], [tomatoes, peppers, onion], [code, coffee]]

   }
}

