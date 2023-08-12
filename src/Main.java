import java.util.ArrayList;

public class Main {
   public static void main(String[] args){

       ArrayList<String> food = new ArrayList<String>();

       food.add("pizza");
       food.add("3ejja");
       food.add("mosli");
//       set (index,element) ==>Replaces the element at the specified position in this list with the specified element
       food.set(2,"ma9arouna");
//remove the specified element based on the index
       food.remove(1);

       //to clear our list we can use :
//       food.clear();

       for (int i=0;i<food.size();i++){
           System.out.print(food.get(i)+" *");
       }

   }
}

