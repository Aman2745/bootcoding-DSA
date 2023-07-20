package linkedlist;

public class MergeTwoLinkedlist {
    public void mergeTwoLists(Node head1, Node head2) {

        Node temp = new Node(head1.data);
        Node ans = temp;

        while (head1 != null && head2 != null)
        {
            if (head1.data <= head2.data) {

                temp.next = new Node(head1.data);
                temp = temp.next;
                head1 = head1.next;

            }
            else
            {
                temp.next = new Node(head2.data);
                temp = temp.next;
                head2 = head2.next;
            }
        }
        if (head1 == null) {
            temp.next = head2;
        }
        else if (head2 == null) {
            temp.next = head1;
        }

        while(ans.next!=null){
            System.out.println(ans.data);
            ans=ans.next;
        }
    }
}
