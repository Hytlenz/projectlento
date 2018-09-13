
import java.util.*;

// itong learn2 is for if statement at for bmi calculator

class learn2{
  
   public static void main(String[] args){
   
   Scanner lento = new Scanner(System.in);
   
   // itong nasa baba ay pwede gawin para sa variable
   double w, h, bmi;
   
   System.out.print("Enter Weight : ");
   w = lento.nextDouble(); // kung makikita mo may lento sa tabi ng nextDouble kasi pang iiscan yan xD
   
   System.out.print("Enter Height : ");
   h = lento.nextDouble(); // kaya nextDouble kasi double yung ilalagay natin.
   
   bmi = w/(h*h); // for math < + is addition , - for subtraction , * for multiply , / for divide>.
   
   if(bmi < 19){ // for translation, ang bmi ay less than to 19.
       System.out.print("Underweight" + bmi); // kaya may bmi para sumama yung result ng bmi
       } else if(bmi >= 19 && bmi <= 24){
       System.out.print("Normal"); // nakalimutan ko na susunod takte HAHAHA pero ganyan sa if else statement ganyan din pag sunod sunod.
       }
    }
 }
