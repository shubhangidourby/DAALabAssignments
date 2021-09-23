package week5;
import java.util.*;
public class ques2 {
    static boolean checkPair(int arr[], int n)
	{
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += arr[i];
		}
		if (sum % 2 != 0)
		{
			return false;
		}
		sum = sum / 2;
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++)
		{
			int val = sum - arr[i];
			if (s.contains(val) && val == (int) s.toArray()[s.size() - 1])
			{
				System.out.print("Pair elements are %d and %d\n", arr[i], val);
				return true;
			}
			s.add(arr[i]);
		}
		return false;
	}
	public static void main(String[] args)
	{
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for(int j=0;j<T;j++)
        {
        int n = sc.nextInt();
		int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
		if (checkPair(arr, n) == false)
		{
			System.out.println("No pair found");
		}
    }
}
}

