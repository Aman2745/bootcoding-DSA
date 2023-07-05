package linkedlist;

public class CheckDivisibility {

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
    public static void divisibility(Node head){
        Node temp=head;

        while(temp.next!=null){
            if(head.data%3==0||head.data%5==0){
                System.out.print(temp.data+" ");;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        insert(head,4);
        insert(head,30);
        insert(head,50);
        insert(head,29);


       divisibility(head);;
    }
}
