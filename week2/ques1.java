package week2 ;
import java.util.*;
public class ques1{
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
       int T,N,key, flag=0,c=0;
       T= sc.nextInt();
       for(int i=0;i<T;i++)
       {
          System.out.println("Enter the size of array: ");
          N=sc.nextInt();
          System.out.println("enter the elements of array: ");
          int a[]= new int[N];
          for(int j=0;j<N;j++)
          {
              a[j]=sc.nextInt();
          }
          System.out.println("Enter the value of key: ");
          key=sc.nextInt();
          for(int k=0;k<N;k++)
          {
              if(a[k]==key)
              {
                  flag=1;
                  c++;
              }
          }
          if(flag==1)
          {
              System.out.println(key +" - "+ c);
          }
          else{
              System.out.println("Key not present");
          }
       }
    }
}
