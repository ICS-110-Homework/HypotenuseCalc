/** hypotenuseCalc.java calculates the hypotenuse using Math.sqrt() and Math.Pow
  * @author Phillip Turner, for Alice+Jacva
  */
import java.util.Scanner; 

 public class HypotenuseCalc{
   public static void main(String[] args) {
     System.out.println("Today we will calculate the hypotenuse.");
     Scanner keyboard = new Scanner( System.in );
     System.out.println("What is the length of leg one?");
     double leg1 = keyboard.nextDouble();
     System.out.println("What is the length of leg two?");
     double leg2 = keyboard.nextDouble();
     double leg1sq = Math.pow(leg1, 2);
     double leg2sq = Math.pow(leg2, 2);
     double radicand = leg1sq + leg2sq;
     double hypot = Math.sqrt(radicand);
     System.out.printf("The hypotenuse of a right triangle with one side measuring " + leg1 + " and the other " + leg2 + " is %2.2f.", hypot);
   }
 }