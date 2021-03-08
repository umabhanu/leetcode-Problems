import java.util.*;

class missing
{
  public int misselement(int[] arr)
  {
    
    
    int n=arr.length;
    int total=0;
    for(int i=0;i<n;i++)
    {
      
      total=arr[i]+total;
     
     }
    return total;
   }
      
      
  public static void main(String args[])
  {
    missing m=new missing();
    int n;
    System.out.println("enter number of elements in the array");
    Scanner sn=new Scanner(System.in); 
    n=sn.nextInt();
    int[] a;
    a=new int[n];
    for(int i=0;i<n-1;i++)
    {
      int input=sn.nextInt();
      a[i]=input;
    }
    Arrays.sort(a);
    int x=m.misselement(a);
    int mn=n;
    int sum= (mn*(mn+1)/2);
    int missele=sum-x;
    System.out.println("missing element is " +missele);
   }
 }
    