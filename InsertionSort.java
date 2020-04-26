

public class InsertionSort
{
    void sort(int[] a)
    {
    for(int i=1;i<a.length;i++)
    {
        int j=i-1;
        int t=a[i];
        while(j>=0 && a[j]>t)
        {
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=t;
    }
    for(int i=0;i<a.length;i++)
    {
    System.out.println(a[i]);
    }

}
    public static void main(String[] args)
    {
        int a[]={23,17,43,56,78,11};

        InsertionSort obj=new InsertionSort();
        obj.sort(a);

        
    }
}