
public class Bubblesorteg{
    static void Bubblesort(int arr[]){
        int n= arr.length;
        int temp=0;

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-1);j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[i] = temp;
                }
            }
        }

    }
public static void main(String args[])
{
    int arr[]={3,60,35,2,45,320,5};

    System.out.println("Array before bubble sort:");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+ " ");
    }
    System.out.println();

    Bubblesort(arr);
    System.out.println("Array after bubble sort :");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i] + " ");
    }
}
}
