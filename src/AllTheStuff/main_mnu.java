package AllTheStuff;

//program for the main menu
import java.util.*;
class main_mnu
{ 
  static String nm;
  main_mnu()
  {
      Scanner obj= new Scanner ( System.in);
      System.out.println("\f");
          System.out.println(" Welcome to the periodic table Table ");
          System.out.println("What is your Name ");
          nm =obj.nextLine();
          disp();
      }
      
 static void disp()
      {  
      int a=0;String pd;
      
      do
          { 
              try{
               Scanner obj= new Scanner ( System.in);
              System.out.println("\f");
              System.out.println("Hello "+nm);
          System.out.println("Please choose anyone of the options below");
          System.out.println("1. Display A group or period");
          System.out.print("2. Search for the atomic number or the mass"); 
              System.out.print(" number  or the  name or the symbol of the"); 
          System.out.println(" element");
          System.out.println("3. Quiz\n4.Exit ");
          System.out.println("Enter  1, 2, 3 or 4 depending on your choice");
          a= obj.nextInt();
          switch(a)
              {
              case 1: period.disp();
                      break;
              case 2: srch.take_input();
                      break;
              case 3:Quiz.elemnt(nm);
                      break;
              case 4 : System.out.println("exiting");
                      break;
              default : {System.out.println("incorrect value entered");
                      System.out.print("please enter 1,2 or 3 depending on");
                      System.out.println("your choice");  
                      System.out.println("Type in Anything to get back after you finish readin this msg");
                    pd=obj.next();}
              }// end of switch
          }catch(Exception e)
          {
              System.out.println("INVALID INPUT ");
          }
          }while (a!=4); // end of while loop
  System.out.println("thank you for using the program");
  System.out.println( "           - created by  ");
  System.out.println( "                  Jawad Ahmed Khan"); 
 
  System.out.println("Itna Paisa Mein Itnaicch Milega");
  
  }
}
