package week1;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int N,flag=0;
        System.out.println("Enter the size of array: ");
        N=sc.nextInt();
        int[] a= new int[N];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int low=0,high=N-1;
        while(low<=high)
        {
            int mid= (low+high)/2;
            if(a[mid]==key)
            {
                flag=1;
                break;
            }
            else if(a[mid]<low)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        if(flag==1)
        {
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key Not Found");
        }
    }
}
