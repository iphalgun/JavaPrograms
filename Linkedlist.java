class Node{
int data;
Node next;
   
public Node(int data){

        this.data=data;
        next=null;
    }
}
class Linkedlist{
    
    static Node head=null;
        public void insertAtEnd(int data)
        {
            Node n=new Node(data);

            if(head!=null)
            {
                Node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                
                temp.next=n;
            }
            else
            {
                head=n;
            }
        }

        public void display()
        {
            if(head!=null)
            {
                Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            }
            else
            {
            System.out.println("Print list is empty");
            }
        }


        public static void main(String[] args)
        {
            Linkedlist l=new Linkedlist();
            l.insertAtEnd(10);
            l.display();
        }
    
}