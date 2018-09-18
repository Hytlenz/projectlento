
// Gagawa tayo ng authentication login system

import java.util.*;

class learn3{

  public static void main(String[] args){
    
    // input again.
    Scanner input = new Scanner(System.in);
    String user = "lento"; // kelangan lento for user, kun for pass ang itatype mo para mapunta sa true statement ng if.
    String pass = "kun";
    String a, b;
    
    // eto yung loop na pabalik balik kapag hindi na execute ang tamang input.
    auth:
    for(x = 0; ; x++){
      System.out.print("Enter Username: "); //Yung itatype mo pag mali babalik sa gantong itsura.
      a = input.next();
      System.out.print("Enter Password: ");
      b = input.next();
      
      if(a.equals(user) && b.equals(pass)){
        System.out.println("Access Granted"); // pag tama eto lalabas.
      } else {
        System.out.println("Invalid User or Pass"); // pag mali babalik ka sa enter user and pass.
      }
    }
       
    }
 }
