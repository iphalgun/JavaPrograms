class LLpush{
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public void push(int new_data)
    {
        Node new_node=new Node(new_data);

        new_node.next=head;
        head=new_node;
    }

    public void insertafter(Node prev_node, int new_data)
    {
        if(prev_node==null)
        {
            System.out.println("previous node cannot be null");
            return;
        }
        Node new_node=new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }

    public void append(int new_data)
    {
        Node new_node=new Node(new_data);

        if(head==null)
        {
            head=new Node(new_data);
            return;
        }

        new_node.next=null;

        Node last=head;
        while(last.next!=null)
        last=last.next;
        
        last.next=new_node;
        return;
    }

    public void plist()
    {
        Node n=head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String args[])
    {
        LLpush list=new LLpush();

        list.head=new Node(1);
        Node second=new Node(2);
        list.head.next=second;

        list.push(9);

        
        list.insertafter(list.head, 2);
        list.plist();
    }
}