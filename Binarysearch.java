

import java.util.Scanner;

class Binarysearch
{
    int BS(int[]a, int d)
    {
        int l=0,h=a.length-1,mid;
        while(l<=h)
        {
            mid=(l+h)/2;

            if(a[mid]==d)
            {
                return mid;
            }
            else
            if(a[mid]<d)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[]=new int[5];
        int a,i;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter array");

        for(i=0;i<5;i++)
        {
            arr[i]=s1.nextInt();
        }

        System.out.println("Enter number to be searched");
        a=s1.nextInt();

        Binarysearch obj=new Binarysearch();
        int value=obj.BS(arr,a);

        if(value==-1)
        {
            System.out.println("number not found");
        }
        else
        {
            System.out.println("found at index "+value);
        }
    }
}