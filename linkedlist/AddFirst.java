package linkedlist;

public class AddFirst {

    public static  void addfirst(Node head,int data){
       Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
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
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        addfirst(head,30);
        insert(head,3);
        insert(head,33);
        addfirst(head,5);
        print(head);
    }



}
