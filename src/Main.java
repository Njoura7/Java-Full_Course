

public class Main {
   public static void main(String[] args){
// switch==> statement that allows a variable to be tested for equality against a list of values
       String day ="Friday";

       switch (day){
           case "Sunday":
               System.out.println("it's sunday!!");
               //break is important so that the rest of code will not be executed if the case is matched
               break;
           case "Monday":
               System.out.println("Monday is here :)");
               break;
           case "Friday":
               System.out.println("joumou3a moubarka");
               break;
               //if there is no match
           default:
               System.out.println("not a day");
       }

   }
}

