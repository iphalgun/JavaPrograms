public class LSexample{
    public static int linearsearch(int[] arr, int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
    
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] a1={2,3,4,5,6,9,1};
        int key=4;
        System.out.println(linearsearch(a1, key));
    }
}