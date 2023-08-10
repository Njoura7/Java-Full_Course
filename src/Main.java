import java.util.Scanner;

public class Main {
   public static void main(String[] args){


       double x=3.14;
       double y=-10;
       int num=26;




       double z=Math.max(y,x);
       System.out.println(z +" is the greater");

       double abs = Math.abs(y);
       System.out.println(abs);

       //The Math.sqrt() function in Java returns a double value
       double sqrt=Math.sqrt(num);
       System.out.println("the square root of "+num+" is "+sqrt);

       //round return the round of the number like in math
       double r =5.5;
       double roundResult=Math.round(r);
       System.out.println("the round of "+r+" is "+roundResult);

       //floor return the first smaller integer
       double f=9.999;
       double floorResult = Math.floor(f);
       System.out.println("the floor of "+f+" is "+floorResult);

       //ceil return the first larger integer
       double c=1.001;
       double ceilResult = Math.ceil(c);
       System.out.println("the 'ceil' of "+c+" is "+ceilResult);

       //EXERCISE: Hypotenuse of triangle

       double a;
       double b;
       double H;

       Scanner scanner = new Scanner(System.in);

       System.out.println("enter side a: ");
       a= scanner.nextDouble();

       System.out.println("enter side b ");
       b= scanner.nextDouble();

       H=Math.sqrt(a*a + b*b);

       System.out.println("the hypotenuse is "+H);

       scanner.close();


   }
}

