public class Bubblesort
{
    void bubblesort(int[]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int a[]={1,12,33,45,22,67};

        System.out.println("Array before bubble sort :");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i] +" ");
        }
        Bubblesort obj=new Bubblesort();
        obj.bubblesort(a);

        System.out.println("Array after bubble sort :");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}