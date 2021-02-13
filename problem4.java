import java.util.*;
class problem4
{
  public static void main(String args[])
  {
    problem4 obj= new problem4();
    int a[], n;
    System.out.println("enter number of elements in array");
    Scanner s= new Scanner(System.in);
    n=s.nextInt();
    a= new int[n];
    for(int i=0;i<n;i++)
    {
  
      int input= s.nextInt();
      a[i]=input;
    }
    Arrays.sort(a);
    System.out.println(" sorted list is" + a);
    for(int i=0;i<n;i++)
    {
      System.out.println("number of elements less than "   +a[i]+ "is"  +i);
    }
  }
}
    