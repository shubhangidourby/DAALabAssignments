package week0;
import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args)
    {
        int n,key,flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n= s.nextInt();
        int[] a= new int[n];
        System.out.println("Enter all the elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the key value: ");
        key= s.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Key Found");
        }
        else
        {
            System.out.println("Key Not Found");
        }
    }
    
}


