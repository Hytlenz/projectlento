import java.util.*;

/*
 * Group of Solar Panel Size Calculator Case Study
 */
 
 class CaseStudy{
  
  public static void main (String[] args){
   
   string title = " [ Solar Panel Size Calculator ] ";
   string bot = " \n[ Arthuria Senpai ] ";
   
   Scanner input = new Scanner (System.in);
   
       System.out.println(title + bot + " The size of Solar Panel is 17.6 Square Feet \n(65 inch x 39k inch) \nAnd its have a 265 watts");
       System.out.print(bot +"Enter the Square Feet of your house \nto know how many solar panel \ncan fit into your roof!\n [ Input Here > ");
            int sf = input.nextInt();
            int sp = (sf/18);
      
       System.out.print(bot + "The number of solar panel can feet into roof are "+ sp +"! \nBut this is not the exact Solar Panel you need);
       System.out.print("\nBecause we didn't know how many Appliances are you using\n We need your kwh and SunLight hours in your places");
       System.out.print("\nto know how many panels you'll need");
       System.out.print("Press r if rainy and s if sunny");
       String choice = input.next();
                        
       if(choice.equalsIgnoreCase("r")){
       System.out.print(bot + "\n This is a Rainy Season \nWe need the 70% of your kwh\n So Enter your kwh per month\n [ Input Here > ");
             double kwh = input.nextDouble();
             double  kwh70 = (kwh*0.7);
       System.out.println("Your 70% kwh is"+kwh70);
             double kwhpd = (kwh70/30);
       System.out.println("Your kwh per day is "+ kwhpd +"!");
       System.out.print(bot +"The Sun Hours per day in Philippines is 5 hours!"+ bot +"Enter your Sunhours \n [ Input Here > ");
             double sh = input.nextDouble();
             double spp = 265*sh;
             double sppp = spp/1000;
             double sp = kwhpd/sppp;
       
       System.out.println(bot +"Your Solar Panel Your Need is "+ sp);  
       
       }else if(choice.equalsIgnoreCase("s")){
        System.out.print("\n This is a Sunny Season \nSo Enter your kwh per month \n[ Input Here > ");
             double kwh2 = input.nextDouble();
             double kwhh = (kwh2/30);
       System.out.println("Your kwh per day is "+kwhh+"!");
       System.out.print(bot +"The Sun Hours per day in Philippines is 5 hours!"+ bot + "Enter Your Sunhours \n [ Input Here > ");
             double shs = input.nextDouble();
             double sps = 265*shs;
             double spps = sps/1000;
             double sop = kwhh/spps;
       
       System.out.println(bot +"Your Solar Panel Your Need is"+sop);   
   }
  }
 }
