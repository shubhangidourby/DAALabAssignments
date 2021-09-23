package week3;
import java.util.*;
public class selectionsort {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int k=0;k<t;k++)
       {
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,j;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int comp=0;
        int shift=0;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[i])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    comp++;
                    shift++;
                }
                comp++;
            }
        }
         for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\n"+ comp+" "+shift);
        sc.close();
}
}
}