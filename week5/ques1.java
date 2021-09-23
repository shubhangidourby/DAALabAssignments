package week5;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t--)
       {
        int n=sc.nextInt();
        int i;
        char ch[]= new char[n];
        for(i=0;i<n;i++)
        ch[i]= (char) sc.nextInt();
        int count[2]={0};
        for(i=0;i<n;i++)
        {
            int k=ch[i];
            count[ch[i]-97]++;
        }
        int max=count[0];
        char k=0+97;
         for(i=1;i<26;i++)
        {
            if(count[i]>max)
            {
                max=count[i];
                k=(char) (i+97);
            }
        }
        if(max>1)
        {
            System.out.println(k+" "+max);
        }
        else
        System.out.println("No Repetation");
    }
    }
    
}
