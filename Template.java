package template;

import java.util.*;
public class Template {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
      
       System.out.println("==========NOTE: The size of Solar Panel is 17.6 Square Feet (65 inch x 39k inch) And its have a 265 watts ==========");
       System.out.println("");
       System.out.println("Enter the Square Feet of your house to know how many solar panel can fit into your roof!");
             int SquareF = input.nextInt();
             int SolarP = (SquareF/18);
      
       System.out.println("The number of solar panel can feet into roof are "+SolarP+"!");
       System.out.println("But this is not the exact Solar Panel you need");
       System.out.println("Because we didn't know how many Appliances are you using ");
       System.out.println("So we need your kwh and SunLight hours in your places to know how many panels you'll need ");
       System.out.println("Press r if rainy and s if sunny");
       String choice = input.next();
       if(choice.equals("r")){
       System.out.println("===================================================================================");
       System.out.println("We need the 70% of your kwh");
       System.out.println(" So Enter your kwh per month: ");
             double kwh = input.nextDouble();
             double  kwh70 = (kwh*0.7);
       System.out.println("Your 70% kwh is"+kwh70);
             double kwhperday = (kwh70/30);
       System.out.println("Your kwh per day is "+kwhperday+"!");
       System.out.println("==========NOTE: The Sun Hours per day in Philippines is 5 hours!==========");
       System.out.println("Enter your SunLightHours: ");
       double sunhours = input.nextDouble();
       double solarpanelproduce = (265*sunhours);
       double solarpanelproduce2 = (solarpanelproduce/1000);
       System.out.println(" ");
       double solarpanel = (kwhperday/solarpanelproduce2);
       
       System.out.println("YOUR SOLAR PANEL YOU'LL NEED IS "+solarpanel);  
       
       }else if(choice.equals("s")){
        System.out.println("===================================================================================");
        System.out.println(" So Enter your kwh per month: ");
             double kwh2 = input.nextDouble();
             double KWH = (kwh2/30);
       System.out.println("Your kwh per day is "+KWH+"!");
       System.out.println("==========NOTE: The Sun Hours per day in Philippines is 5 hours!==========");
       System.out.println("Enter your SunLightHours: ");
       double sunhours1 = input.nextDouble();
       double solarpanelproduce1 = (265*sunhours1);
       double solarpanelproduce3 = (solarpanelproduce1/1000);
       double solarpanel = (KWH/solarpanelproduce3);
       
       System.out.println("YOUR SOLAR PANEL YOU'LL NEED IS "+solarpanel);   
       }
       
       
       
       
       
    }
         
}
 
