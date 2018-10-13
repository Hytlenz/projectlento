package pascal;

import java.util.*;

/*
 * Group of Solar Panel Size Calculator Case Study
 */
 
 class Pascal{
  
  public static void main (String[] args){
   
   String title = " [ Solar Panel Size Calculator ] ";
   String bot = " \n[ Arthuria Senpai ] ";
   
   Scanner input = new Scanner (System.in);
   
       System.out.println(title + bot + " The size of Solar Panel is 17.6 Square Feet \n(65 inch x 39k inch) \nAnd its have a 265 watts");
       System.out.print(bot +"Enter the Square Feet of your house \nto know how many solar panel \ncan fit into your roof!\n [ Input Here ]: ");
       //Input Squre Feet to know how many solar panels can fit into your roof.
            int squarefeet = input.nextInt();
            int sp = (squarefeet/18);
      
       System.out.print(bot + "The number of solar panel can feet into roof are \n [ "+ sp +" ] \nBut this is not the exact Solar Panel you need");
       System.out.print("\nBecause we didn't know how many Appliances are you using\n We need your kwh and Sunhours in your places");
       System.out.print("\nto know how many panels you'll need\n");
       System.out.print(bot + "\nPress r if rainy and s if sunny\n [ Input Here ]: ");
       String choice = input.next();
       //Input r or s to know your season in your country.
   
       if(choice.equalsIgnoreCase("r")){
       System.out.print(bot + "\n This is a Rainy Season \nWe need the 70% of your kwh\n So Enter your kwh per month\n [ Input Here ]: ");
             double kwh = input.nextDouble();
             double kwh70 = (kwh*0.7);
       System.out.println("Your 70% kwh is "+kwh70);
             double kwhperday = (kwh70/30);
       System.out.println("Your kwh per day is "+ kwhperday +"!");
       System.out.print(bot +"The Sun Hours per day in Philippines is 5 hours!"+ bot +"Enter your Sunhours \n [ Input Here ]: ");
             double sunhours1 = input.nextDouble();
             double spp1 = (265*sunhours1);
             double spp2 = (spp1/1000);
             double sp1 = (kwhperday/solarpanelproduce2);
       //spp means Solar Panel Produce and sp means Solar Panel.
       System.out.println(bot +"Your Solar Panel Your Need is "+ sp1);  
       
       }else if(choice.equalsIgnoreCase("s")){
        System.out.print("\n This is a Sunny Season \nSo Enter your kwh per month \n[ Input Here ]: ");
             double kwh2 = input.nextDouble();
             double kwhh = (kwh2/30);
       System.out.println("Your kwh per day is "+kwhh+"!");
       System.out.print(bot +"The Sun Hours per day in Philippines is 5 hours!"+ bot + "Enter Your Sunhours \n [ Input Here ]: ");
             double sunhours2 = input.nextDouble();
             double spp3 = (265*sunhours2);
             double spp4 = (spp3/1000);
             double sp2 = (kwhh/spp4);
       //spp means Solar Panel Produce and sp means Solar Panel.
       System.out.println(bot +"Your Solar Panel Your Need is "+sp2);   
   }
  }
 }
