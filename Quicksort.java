import java.util.Scanner;

public class Selectionsort
{
    void quicksort(int[] a, int s, int e)
    {
        if(s<e)
        {
            int p=partition(a,s,e);
            quicksort(a, s, p-1);
            quicksort(a, s, e);
        }
    }
    int partition(int[] a, int s, int e)
    {
        int k=s;
        for(int i=s;i<e;i++)
        {
            if(a[i]<=a[e])
            {
                a[i]=a[k];
                k++;
            }
        }
        a[k]=a[e];
        return k;
        
    }
    public static void main(String[] args)
    {
        int a[]={10,2,9,1,11,20};

        int z=a.length;
        SelectionSort obj=new SelectionSort();
        obj.quicksort(a,0,z-1);
        
    }
}