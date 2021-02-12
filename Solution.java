

import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        
        System.out.println("" +nums[0]);
        int n = nums.length;
        for(int i=1;i<=n;i++)
        {
          nums[i]=nums[i]+nums[i-1];
           System.out.println("" +nums[i]);
        }
        return null;
       
    }   
    public static void main(String args[])
    {
        
        Solution obj= new Solution();
        System.out.println("enter elements in array and n is number of elements");
        int n;
        Scanner in= new Scanner(System.in);
        n= in.nextInt();
         int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            Scanner sn=new Scanner(System.in);
            int input = sn.nextInt();
            a[i] = input;
        }
        obj.runningSum(a);
        
    }
}