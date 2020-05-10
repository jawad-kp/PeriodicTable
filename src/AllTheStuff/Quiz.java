package AllTheStuff;

import java.util.*;
class Quiz 
{
    
     static String nm[]=period.nm; // Array reference
     static String syb[]=period.syb;
     static int sy1[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     static int sy2[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     static int sy3[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     
     static int nm1[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     static int nm2[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
     static int nm3[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    
     static int sele,num,pt,i;

     static float temp,temp2;
     static String choice,ans,pd;
     static boolean tm=true;
     
     static void set()
     {  int j;
         for(j=0;j<nm1.length;j++)
         {   nm1[j]=0;
             sy1[j] = 0;
            }
            for( j=0;j<nm2.length;j++)
         {   nm2[j]=0;
             sy2[j] = 0;
            }
            for( j=0;j<nm3.length;j++)
         {   nm3[j]=0;
             sy3[j] = 0;
            }
            
          
            
        }
 static void elemnt(String name)
 {    set(); 
     Scanner obj= new Scanner (System.in);
     pt=0;
     
     System.out.println("\fHi "+ name+" Welcome to the Quiz ");
    do {
            System.out.println( " Do you want to start with \nSymbols (a symbol will be displayed and you type in the name)\n or\n Element Name ( an element name will be displayed and you type in symbol)\nor\n do you want to exit ");
             System.out.println( "Type \"Symbol\"  to play Quiz on symbols or \"name\" to play it on Names or \"exit\" to well.... exit");
             choice=obj.next();
             
            if (choice.equalsIgnoreCase("Symbol"))
           { 
                Symbol( name);
              
           }//end of if
            else if (choice.equalsIgnoreCase("Name"))
            {
               Name(name);
               }//end of if
                else if (choice.equalsIgnoreCase("Exit"))
                { System.out.println("Exiting");
                    tm=false;
                }//end of if
                else 
                System.out.println("Enter A valid Choice");
            }while(tm==true);
                
                    
                        
                        
    }//END OF METHOD
    static void Symbol(String name)
    {            
              Scanner obj= new Scanner (System.in);
              System.out.println( " do you want to play as ");
              System.out.println( "1. Begineer");
              System.out.println( "2. Amateur");
              System.out.println( "3. I know all about the periodic table ask me any thing ;-)");
              System.out.println( " type in the serial number corresponding to your choice");
              System.out.println( "so  "+ name +"  what\'s your choice");
              sele=obj.nextInt();
            
                switch(sele)
                { 
                    case 1 :System.out.println("Alright begineer lets start!!! Type in anything to begin");
                            pd=obj.next();
                            for(i=1;i<=10;i++)
                            { cd :
                             while (true)
                           {    
                            temp=(float)Math.random();
                             temp2=temp*100;
                             num=(int)temp2;
                             if (num>10)
                             num=num/10;
                             if (num >=0&& num<10)
                            { if (sy1[num]==0)
                             break cd;
                            } //outer if
                        }//while loop
                            sy1[num]=1;
                             System.out.println(syb[num]);
                             ans=obj.next();
                             if (ans.equalsIgnoreCase(nm[num]))
                            {
                                System.out.println("Correct Answer");
                                pt+=5;
                            }
                            else
                            System.out.println("Incorrect answer");
                        }
                         System.out.println("Your Points are: " +pt+" out of 50");
                         if(pt==50)
                         System.out.println("Awesome looks like you're ready to be promoted");
                         else if(pt>=40&&pt<50)
                         System.out.println("Really really close bud try again and this time aim for a perfect score you can surely achieve it");
                         else if(pt>=0&&pt<=15)
                      System.out.println("In your Defence you did say you were a Begineer so study harder and you'll succeed");
                   System.out.println("Type in Anything when you're done lookin at your scores");
                      pd=obj.next();
                      break;
                    case 2 :i=0; System.out.println("Alright now !! type in anything to begin ");
                                    pd=obj.next();
                                
                    while (true)
                            {
                            cd :
                             while (true)
                           {    
                            temp=(float)Math.random();
                             temp2=temp*100;
                             num=(int)temp2;
                             if (num>15)
                             num=num/10;
                             if (num >=0&& num<=16)
                            { if (sy2[num]==0)
                             break cd;
                            } //outer if
                        }//while loop
                           sy2[num]=1;
                             System.out.println(syb[num]);
                             ans=obj.next();
                             if (ans.equalsIgnoreCase(nm[num]))
                            {
                                System.out.println("Correct Answer");
                                pt+=5;
                            }//if
                            else
                            System.out.println("Incorrect answer");
                            i++;
                            if(i==15)
                            break;
                        }//while
                        System.out.println("Your Points are: " +pt+" out of 75");
                      if (pt==75)
                        System.out.println("Fantastico buddy great going perfect score huh!!!! :)");
                        else if(pt>=60&&pt<70)
                         System.out.println("Okay !!! Wasn't that close? Keep it up lets settle only for a perfect one next time");
                         else if(pt==0)
                      System.out.println("Whaaaat!!!!! c'mon back after studying harder");
                      System.out.println("Type in Anything wen your done lookin at Ur scores");
                      pd=obj.next();
                      break;

                     
                    case 3: System.out.println("Well Expert lets see how much of an expert you really are Type in anything to begin");
                            pd=obj.next();
                            for(i=1;i<=20;i++)
                            {
                             cd :
                             while (true)
                           {    
                            temp=(float)Math.random();
                             temp2=temp*100;
                             num=(int)temp2;
                             if (num>50)
                             num=num/10;
                             if (num >=0&& num<=21)
                            { if (sy3[num]==0)
                             break cd;
                            } //outer if
                        }//while loop
                             sy3[num]=1;
                             System.out.println(syb[num]);
                             ans=obj.next();
                             if (ans.equalsIgnoreCase(nm[num]))
                            {
                                System.out.println("Correct Answer");
                                pt+=5;
                            }
                            else
                            System.out.println("Incorrect answer");
                        }
                         
                        System.out.println("Your Points are: " +pt+" out of 100");
                      if (pt==100)
                      System.out.println("You truly now the periodic table like the back of your hand. Perfecto bud ");
                      else if (pt>=85&&pt<=90)
                      System.out.println("Close but never give up and try harder");
                      else if (pt==95)
                      System.out.println("Was that CLOSE or was That CLOSE ?? great going dude am sure u can achieve a Hundred");
                      else if (pt>=0&&pt<=25)
                      System.out.println("And you said you knew the periodic table  pretty well. Dissapointing:( work hard like seriously !");
                      else if(pt==35)
                      System.out.println("Thats called JUST PASSING work hard ");
                      System.out.println("Type in Anything wen your done lookin at Ur scores");
                      pd=obj.next();
                      break;
                    default : {System.out.println("Enter A valid Choice");
                    System.out.println("Type in Anything to get back after you finish readin this msg");
                      pd=obj.next();}
                    }//end of switch
               elemnt(name); }
    static void  Name(String name)
    {           
        Scanner obj= new Scanner (System.in);
         System.out.println( " do you want to play as ");
              System.out.println( "1. Begineer");
              System.out.println( "2. Amateur");
              System.out.println( "3. I know all about the periodic table ask me any thing ;-)");
              System.out.println( " type in the serial number corresponding to your choice");
              System.out.println( "so "+name+" what\'s your choice");
              sele=obj.nextInt();
            
                switch(sele)
                { 
                    case 1 : System.out.println("Alright begineer lets start!!! Type in anything to begin");
                            pd=obj.next();
                            for(i=1;i<=10;i++)
                            {
                            cd :
                             while (true)
                           {    
                            temp=(float)Math.random();
                             temp2=temp*100;
                             num=(int)temp2;
                             if (num>10)
                             num=num/10;
                             if (num >=0&& num<=11)
                            { if (nm1[num]==0)
                             break cd;
                            } //outer if
                        }//while loop
                              nm1[num]=1;
                             System.out.println(nm[num]);
                             ans=obj.next();
                             if (ans.equalsIgnoreCase(syb[num]))
                            {
                                System.out.println("Correct Answer");
                                pt+=5;
                            }
                            else
                            System.out.println("Incorrect answer");
                        }
                         
                        System.out.println("Your Points are: " +pt+" out of 50");
                        if(pt==50)
                         System.out.println("Awesome looks like you're ready to be promoted");
                         else if(pt>=40&&pt<50)
                         System.out.println("Really really close bud try again and this time aim for a perfect score you can surely achieve it");
                         else if(pt>=0&&pt<=15)
                      System.out.println("In your Defence you did say you were a Begineer so study harder and you'll succeed");
                        System.out.println("Type in Anything wen your done lookin at Ur scores");
                      pd=obj.next();
                        break;
                    
                    case 2 :System.out.println(" Alrighty then bud type in anything to start");
                            i=0; 
                        while (true)
                            {
                            cd :
                             while (true)
                           {    
                            temp=(float)Math.random();
                             temp2=temp*100;
                             num=(int)temp2;
                             if (num>15)
                             num=num/10;
                             if (num >=0&& num<=16)
                            { if (nm2[num]==0)
                             break cd;
                            } //outer if
                        }//while loop
                           nm2[num]=1;
                             System.out.println(nm[num]);
                             ans=obj.next();
                             if (ans.equalsIgnoreCase(syb[num]))
                            {
                                System.out.println("Correct Answer");
                                pt+=5;
                            }//if
                            else
                            System.out.println("Incorrect answer");
                            i++;
                            if(i==15)
                            break;
                        }//while
                        System.out.println("Your Points are: " +pt+" out of 75");
                         if (pt==75)
                        System.out.println("Fantastico buddy great going perfect score huh!!!! :)");
                         else if(pt>=60&&pt<70)
                         System.out.println("Okay !!! Wasn't that close? Keep it up lets settle only for a perfect one next time");
                         else if(pt==0)
                      System.out.println("Whaaaat!!!!! c'mon back after studying harder");
                      System.out.println("Type in Anything wen your done lookin at Ur scores");
                      pd=obj.next();
                      break;
                      
                    case 3: System.out.println("Well Expert lets see how much of an \"Expert\" you really are Type in anything to begin");
                            pd=obj.next();
                            for(i=1;i<=20;i++)
                            {
                             cd :
                             while (true)
                           {    
                            temp=(float)Math.random();
                             temp2=temp*100;
                             num=(int)temp2;
                             if (num>50)
                             num=num/10;
                             if (num >=0&& num<=21)
                            { if (nm3[num]==0)
                             break cd;
                            } //outer if
                        }//while loop
                             nm3[num]=1;
                             System.out.println(nm[num]);
                             ans=obj.next();
                             if (ans.equalsIgnoreCase(syb[num]))
                            {
                                System.out.println("Correct Answer");
                                pt+=5;
                            }
                            else
                            System.out.println("Incorrect answer");
                        }
                         
                        System.out.println("Your Points are: " +pt+" out of 100");
                          if (pt==100)
                      System.out.println("You truly know the periodic table like the back of your hand. Perfecto bud ");
                      else if (pt>=85&&pt<=90)
                      System.out.println("Close but never give up and try harder");
                      else if (pt==95)
                      System.out.println("Was that CLOSE or was that CLOSE ?? great going dude am sure u can achieve a Hundred");
                      else if (pt>=0&&pt<=25)
                      System.out.println("And you said you knew the periodic table  pretty well. Dissapointing:( work hard like seriously !");
                      else if(pt==35)
                      System.out.println("Thats called JUST PASSING work hard ");
                     System.out.println("Type in Anything wen your done lookin at Ur scores");
                      pd=obj.next();
                      break;

                     default :{ System.out.println("What are you doin bud ???? :-|read the instructions again and plz enter a valid choice");
                         System.out.println("Type in Anything to get back after you finish readin this msg");
                      pd=obj.next();}
                    }//end of switch
              elemnt(name);  }
               
}//END OF CLASS