import java.util.*;
class s{

public static void main(String[] args)
    {
        

        System.out.println("enter the number");

        Scanner input=new Scanner(System.in);

        
        
        int small=65535,i=0;

        while(i<=10)
        {
          int number=input.nextInt();
           if(number<small)
           {
             
              small=number;
            }
          i++;
         }

           System.out.println("the smallest is:"+small);
      
    }
}