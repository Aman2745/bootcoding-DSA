package linkedlist;

public class PrimeNumber {
    public static void checkprime(Node head) {
        Node temp = head;
        if (temp.next == null) {
            return;
        }
        while (temp.next != null) {
            if(temp.data<1) {
                return ;
            }

                if (temp.data %2 == 0) {
                    System.out.print(temp.data + " ");
                }
                temp = temp.next;
            }
        }
    }

