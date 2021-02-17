import java.util.*;
class sumofarray
{
  public void sum(int[] a)
  {
    int n=a.length;
    int sum=0;
    for(int i=0;i<n;i++)
    {
       sum=sum+a[i];
    }
    System.out.println("sum is" +sum);
 }
 
  public static void main(String args[])
  {
     sumofarray s=new sumofarray();

     int[] arr;
     int n;
     System.out.println("enter number of elements in the array");
     Scanner sn = new Scanner(System.in);
     n=sn.nextInt();
     arr =new int[n];
     for(int i=0;i<n;i++)
     {
       int input=sn.nextInt();
       arr[i]=input;
     }
     s.sum(arr);
    }
 }
 
       