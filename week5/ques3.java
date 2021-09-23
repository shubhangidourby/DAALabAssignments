package week5;

import java.util.Scanner;

public class ques3 {
    static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
  
		public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++)
        {
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[] arr1= new int[m];
        int[] arr2= new int[n];
        for(int j=0;j<m;j++)
        {
            arr1[j]=sc.nextInt();
        }
        for(int k=0;k<n;k++)
        {
            arr2[k]=sc.nextInt();
        }
		printIntersection(arr1, arr2, m, n);
        }
	}
}
