

import java.util.Scanner;

class BSusingRecursion
{
    int BS(int[]a, int d, int l, int h)
    {
        if(l<=h)
        {
            int mid=(l+h)/2;
            
            if(a[mid]==d)
            {
                return mid;
            }
            else
            if(a[mid]<d)
            {
                return BS(a,d,mid+1,h);
            }
            else
            if(a[mid]>d)
            {
                return BS(a,d,l,mid-1);
            }
        }
        return -1;
    }

public static void main(String[] args)
{
    int arr[]=new int[5];
    int d,i;
    Scanner s1=new Scanner(System.in);
    System.out.println("Enter array : ");

    for(i=0;i<5;i++)
    {
        arr[i]=s1.nextInt();
    }

    System.out.println("Enter number to be searched");
    d=s1.nextInt();

    BSusingRecursion z=new BSusingRecursion();
    int value=z.BS(arr,d,0,arr.length-1);

    if(value==-1)
    {
        System.out.println("Not Found");
    }
    else
    {
        System.out.println("Found");
    }

}
}