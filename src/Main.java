import java.util.Random;


public class Main {
   public static void main(String[] args){

       //that's kinda of random
       Random random = new Random();
       //pass value to nextInt meth to limit the random integer generated
       // in this example we added one, because per default nextInt(x) generate numbers between 0 and x-1
       int x = random.nextInt(9)+1;
       System.out.println(x);
       //nextDouble methode generate a double between 0 and 1
       double y=random.nextDouble();
       System.out.println(y);

       //same with nextBoolean which generate randomly between the two values 'true' and 'false'



   }
}

