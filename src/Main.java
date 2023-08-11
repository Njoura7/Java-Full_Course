

public class Main {
   public static void main(String[] args){

       //array==> used to store multiple values in a single variable

       //values have top be the same data type og the string
       String [] cars ={"Camaro","Corvette","Tesla"};

      //reassign a value within the array
       cars[0] = "Mustang";

       //print the second value of the array, since the index start with 0 always
       System.out.println(cars[1]);

       //Array index is out of bounds
//       System.out.println(cars[4]);

       //other method of creating arrays

       int[] numbers =new int[5];
       //just random numbers
       numbers[0]=13;
       numbers[1]=6;
       numbers[2]=1999;
       numbers[3]=7;
       numbers[4]=4;

       for(int i=0;i<= numbers.length;i++){
           System.out.println(numbers[i]);
       }

   }
}

