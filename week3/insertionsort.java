package week3;

import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
    int t= sc.nextInt();
    for(int k=0;k<t;k++)
    {
        int n= sc.nextInt();
        int[] a= new int[n];
        int i,j;
        for(i=0;i<n;i++)
       { a[i]=sc.nextInt();}
        int comp=0;
        int shift=0;
        for(i=1;i<n;i++)
        {
            int curr=a[i];
            j=i-1;
            while(a[j]>curr&&j>=0)
            {
                comp++;
                a[j+1]=a[j];
                shift++;
                j--;
            }
            comp++;
            a[j+1]=curr;
        }
        for(i=0;i<n;i++)
       { System.out.print(a[i]+ " ");
    }
        System.out.print("\n"+ comp+" "+shift);
    }
    sc.close();
}
}