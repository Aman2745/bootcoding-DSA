package linkedlist;

public class InsertAtLast {
    //inserting at last position
    public  static  void insert(Node head,int value){
        if(head==null){
            head=new Node(value);
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(value);
    }

    public static  void deletenode(Node head){
        Node current=head;
        Node previous=current;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
    }


    //print function
    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        //insert element in linkedlist
        insert(head,20);
        insert(head,30);
        insert(head,40);
        deletenode(head);
        insert(head,3);
        InsertAtLast.print(head);
        PrimeNumber.checkprime(head);
    }
}
