package week2;
import java.util.*;
import java.io.*;
public class ques3 {
    static int binarySearch(int arr[], int low, int high, int x)
    {
        if (high >= low)
        {
            int mid = low + (high - low) / 2;
            if (x == arr[mid])
                return mid;
            if (x > arr[mid])
                return binarySearch(arr, (mid + 1), high, x);
            else
                return binarySearch(arr, low, (mid - 1), x);
        }
        return -1;
    }
    static int countPairsWithDiffK(int arr[], int n, int k)
    {
        int count = 0, i;
        Arrays.sort(arr);
        for (i = 0; i < n - 1; i++)
            if (binarySearch(arr, i + 1, n - 1,arr[i] + k) != -1)
                count++;
 
        return count;
    }
    public static void main(String args[])
    {
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("Count of pairs with given diff is "  + countPairsWithDiffK(arr, n, k));
    }
}


 