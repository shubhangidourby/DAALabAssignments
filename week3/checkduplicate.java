package week3;
import java.util.ArrayList;
import java.util.Scanner;
public class checkduplicate {
    static void findDuplicates(int arr[], int len)
	{
		int flag=0;
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < len - 1; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] == arr[j]) {
					if (al.contains(arr[i])) {
						break;
					}
					else {
						al.add(arr[i]);
						flag=1;
					}
				}
			}
		}
		if (flag==1) {

			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}
	public static void main(String[] args)
	{
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            findDuplicates(arr, n);
        }
        sc.close(); 
	}
}

