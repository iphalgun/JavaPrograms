


    class Node
    {
        int d;
        Node next;
        Node(int d)
        {
            this.d=d;
        }
    }
    r
    class LL
    {
        Node head;
        void insertinbeg(int x)
        {
            Node temp=new Node(x);
            if(head==null)
            {
                head=temp;
            }
            else
            {
                temp.next=head;
                //head.prev=temp;
                head=temp;
            }

        }
        void display()
        {
            Node tmp=head;
            while(tmp!=null)
            {
                System.out.println(tmp.d);
                tmp=tmp.next;
            }
        }
        public static void main(String[] args)
        {
            LL obj=new LL();
            obj.insertinbeg(10);
            obj.display();
        }
    }
