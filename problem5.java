
import java.util.*;
class problem5
{
  public void calculate(int[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      int c=arr[i];
      for(int j=0;j<c;j++)
      {
        System.out.println("" +arr[i+1]);
       }
      i=i+1;
     }
   }


  public static void main(String args[])
  { 
    problem5 s=new problem5();
    int n;
    System.out.println("enter total number of elements");
    Scanner sn=new Scanner(System.in);
    n= sn.nextInt();
    int[] a= new int[n];
    for(int i=0;i<n;i++)
    {
      int input= sn.nextInt();
      a[i]=input;
    }
    s.calculate(a);
   }
}
     
 