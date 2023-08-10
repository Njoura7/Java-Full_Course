import java.util.Scanner;

public class Main {
   public static void main(String[] args){

//   logical operators ==> used to connect two or more expressions
//       && : (AND) both conditions must be true
//       || : (OR) either condition must be true
//       ! : (NOT) reverses boolean value of the condition

       Scanner tempScanner=new Scanner(System.in);
       System.out.println("enter the weather");
       int temp= tempScanner.nextInt();

       if(temp>30){
           System.out.println("It's kinda hot");
       }else if(temp>=20 && temp<=30){
           System.out.println("good weather");
       }else{
           System.out.println("it's cold");
       }


       Scanner gameScanner = new Scanner(System.in);
       System.out.println("you are playing a weird game, press Q or q to quit");

       String gameKey = gameScanner.next();
       if(gameKey.equals("q")||gameKey.equals("Q")){
           System.out.println("you quit the game");
       }

       Scanner gameScanner2 = new Scanner(System.in);
       System.out.println("you are playing another weird game, press E or e to quit");

       String gameKey2 = gameScanner.next();
       if(!gameKey2.equals("e")&&!gameKey2.equals("E")){
           System.out.println("you are still playing");
       }else{
           System.out.println("you pressed e or E and you quit");
       }
       gameScanner2.close();
   }
}

