
class Merge
{
    void merge(int[] a, int s, int m, int e)
    {
        int L[]=new int[m-s+1];
        int R[]=new int[e-m];
        int P,q,i,p=q=0;

        for(i=s;i<e;i++)
        {
            if(i<=m)
            L[p++]=a[i];
            else
            R[q++]=a[i];
        }
        p=q=0;i=s;
        while(p<L.length && q<R.length)
        {
            if(L[p]<R[q])
            a[i++]=L[p++];
            else
            a[i++]=R[q++];
        }
        while(p<L.length)
        a[i++]=L[p++];
        while(q<R.length)
        a[i++]=R[q++];
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static void main(String args[])
    {
        int[] a={1,9,3,4,5};
        int s=0;
        
        int e=4;
        int m=(s+e)/2;
        Merge obj=new Merge();
        obj.merge(a,s,m,e);
    }
}