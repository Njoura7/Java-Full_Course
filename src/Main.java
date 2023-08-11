

public class Main {
   public static void main(String[] args){

       // 2D array = an array of arrays

       String[][] sports = new String[2][2];

       //declaring the content of our 2d array

       sports[0][0]="Tennis";
       sports[0][1]="Ping-pong";
       sports[1][0]="Volley-ball";
       sports[1][1]="Football";

       //alternative way to declare arrays

//       String[][] sports=   {
//                                {"Tennis","Ping-pong"},
//                                {"Volley-ball","Football"}
//                            };

       //enhanced for or forEach syntax
       for (String[] sport : sports) {
           System.out.println();
           for (int j = 0; j < sport.length; j++) {
               System.out.print(sport[j] + " ");
           }
       }
   }
}

