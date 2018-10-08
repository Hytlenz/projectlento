import java.util.*;

/*
 * Group of Solar Panel Size Calculator Case Study
 */
 
 class casestudy{
  
  public static void main (String[] args){
   
   Scanner input = new Scanner (System.in);
   
   System.out.print("\n Enter your Watts");
   float x = input.nextFloat();
   
   System.out.print("\n Enter your hours");
   float y = input.nextFloat();
   
   float z = x*y;
   float a = z/1000;
   float b = a*30;
   
   System.out.print("\n Kilowatts is " + a);
   if(a == 1){
    System.out.print("1 Solar Panel");
   } else if(a == 2){
    System.out.print("2 Solar Panels");
   }
  }
 }
