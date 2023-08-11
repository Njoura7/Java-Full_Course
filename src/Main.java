

public class Main {
   public static void main(String[] args) {

       // for loop ==> executes a block of a code for a limited amount of times based on a condition

       //the incrementation can be customizable; the most known ones are i++ and i-- but it can be set to i+=3 or i-=2 for example to control the step dor each increment

//       for(declare index;condition to stop;increment or decrement){
//           block of code to execute
//       }

       for (int i=0; i <= 10; i++) {
           System.out.println(i+" Hello for loop");
       }
       for(int i=10;i>=0;i-=2){
           System.out.println(i);

       }
       System.out.println("end of loop");
   }
}

