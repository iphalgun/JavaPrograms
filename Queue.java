class Queue
{
    int[] arr;
    int front,rear;
    Queue()
    {
        arr=new int[];
        front=rear=-1;
    }
    void enqueue(int x)
    {
        if(rear==arr.length-1)
        {
            System.out.println("overflow");
            return;
        }
        arr[++rear]=x;
        System.out.println(" "+x);
        if(rear==0)
        {
            front=0;
        }
    }
    int dequeue()
    {
        if(front==-1)
        {
            System.out.println("underflow");
            
        }
        int x=arr[front];
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front++;
        }
        return x;
    }
    public static void main(String args[])
    {
        Queue obj=new Queue();
        obj.enqueue(5);
        obj.enqueue(8);
        obj.dequeue();
    }
}