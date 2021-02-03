package Homework.Arrays;

import java.util.*;

public class KConcatenation {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[]=new int[n];

        for(int j=0;j<n;j++)
        {
            array[j]=sc.nextInt();
        }

        int res[] = repeat(array,n,k);

        System.out.println(maxsubarraysum(res));

    }
    public static int maxsubarraysum(int res[])
    {
        int maxsum=Integer.MIN_VALUE;
        int cursum=0;

        for(int i=0;i<res.length;i++)
        {
            cursum+=res[i];
            maxsum = Math.max(cursum, maxsum);
            cursum = cursum < 0 ? 0 : cursum;
        }

        return maxsum;
    }
    public static int[] repeat(int a[],int n,int k)
    {
        int res[]=new int[n*k];

        for(int i=0;i<n;i++)
        {
            int temp=i;

            while(temp<res.length)
            {
                res[temp]=a[i];
                temp+=n;
            }

        }

        return res;
    }
}

