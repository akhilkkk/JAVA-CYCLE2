import java.util.*;
class sumofarray
{
  public static void main(String args[])
  {
   int N,sum=0,i;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter the number of elements in the array:");
   N=obj.nextInt();
   int a[]=new int[N];
   System.out.println("Enter the array element:");
   for(i=0;i<N;i++)
   {
    a[i]=obj.nextInt();
    sum=sum+a[i];
   }
   System.out.println("Sum of elements in array="+sum);
 }
}
