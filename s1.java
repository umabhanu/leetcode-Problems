import java.util.*;
class s1{

public static void main(String[] args)
    {
        

        System.out.println("enter the number");

        Scanner input=new Scanner(System.in);

                                                                                   
        
        int small=0,i=1,number2;
        int number1=input.nextInt();
          if(number1>small)
          {
            small= number1;
           }

        while(i<10)
        {
          
             number2=input.nextInt();
            if(number2<small)
           {
             
              small=number2;
            }
          i++;
         }
          

          
         

           System.out.println("the smallest is:" +small);
      
    }
}