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
        int maxcurrent = res[0];
        int maxglobal = res[0];

        for(int i=1;i<res.length;i++)
        {
            maxcurrent = Math.max(res[i], maxcurrent + res[i]);
            maxglobal = Math.max(maxcurrent, maxglobal);
        }

        return maxglobal;
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

