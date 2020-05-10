package AllTheStuff;

//program for searching elements
import java.util.*;
class srch 
{

  static String syb[]=period.syb;
  static String nm[]=period.nm;
  static float atwt[]=period.atwt;
static void take_input()
{
Scanner obj = new Scanner (System.in);
String srch,choice;
int n,i,l,p;
p=1;
Boolean flag=false;
System.out.println("\f");
do {
System.out.println("Do you want to search a /an");
System.out.println("Element");
System.out.println("Symbol");
System.out.println("Atomic number");
System.out.println("Or do you want to exit?");
System.out.print("Type in \"Element\" to search for an ele");
System.out.println("ment  ");
System.out.print("or type in \"Symbol\" to search for a");
System.out.println("Symbol");
System.out.print("or type Number to search for the ");
System.out.println("Atomic number");
System.out.println(" or \"Exit \"to exit");
choice= obj.next();
if (choice.equalsIgnoreCase("Element"))
{ System.out.println("Enter the name of the element");
srch= obj.next();
for(i=0;i<117;i++)
{
if (srch.equalsIgnoreCase(nm[i]))
{
flag=true;
break;
}//if
}//for
if (flag==true)
{ l= i+1;
System.out.println("element Name "+nm[i]); 
     System.out.println("Symbol "+syb[i]);
     System.out.println("Atomic  Number : "+l);
if (l==117||l==118)
System.out.println("Atomic weight not yet Found");
else //lst 2 elements hav no wt
System.out.println(" Atomic weight "+ atwt[i]);
}//if
else 
{
System.out.println("Element Does not exist"); 
System.out.println("please look and type in again");
}//else
} //end of search for elements

else if (choice.equalsIgnoreCase("Symbol"))
{ System.out.println("Enter the Synbol");
srch= obj.next();
for (i=0;i<117;i++)
{
if (srch.equalsIgnoreCase(syb[i]))
{
flag=true;
break;
}//if
}//for
if (flag==true)
{ l= i+1;
System.out.println("element Name "+nm[i]); 
     System.out.println("Symbol "+syb[i]);
     System.out.println("Atomic  Number : "+l);
if (l==117||l==118)
System.out.println("Atomic weight not yet Found");
else //lst 2 elements hav no wt
System.out.println(" Atomic weight "+ atwt[i]);
}//if
else 
{
System.out.println("Symbol  Does not exist"); 
System.out.println("please look and type in again");
}//else
} //end of search for Symbol
else if (choice.equalsIgnoreCase("number"))
{ 
System.out.println(" enter the Atomic Number");
l=obj.nextInt();
if (l<1||l>118)
{System.out.print(" The atomic number does not exist");
System.out.println();
}//2 chk 4 validity of wht�s entered
else 
{ 
i= l-1;
System.out.println("element Name "+nm[i]); 
     System.out.println("Symbol "+syb[i]);
     System.out.println("Atomic  Number : "+l);
if (l==117||l==118)
System.out.println("Atomic weight not yet Found");
else //lst 2 elements hav no wt
System.out.println(" Atomic weight "+ atwt[i]);
}//else
}//end of search for Atomic number
else if (choice.equalsIgnoreCase("Exit"))
{System.out.println(" Exiting");
p=12;}//end of exiting
else 
System.out.println(" please enter a valid choice");
}while (p==1);
}// end of method
}// end of class