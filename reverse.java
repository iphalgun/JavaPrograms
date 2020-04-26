class reverse
{
    static Node head;
    
    static class Node{
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    Node reverse(Node node)
    {
        Node prev=null;
        Node current=node;
        Node next=null;

        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;
        return node;
    }

    void printlist(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
    }

    public static void main(String args[])
    {
        Linkedlistreverse list=new Linkedlistreverse();
        list.head=new Node(20);
        list.head.next= new Node(30);
        list.head.next.next=new Node(10);
        list.head.next.next.next=new Node(56);

        list.printlist(head);
        head=list.reverse(head);
        list.printlist(head);
    }
}