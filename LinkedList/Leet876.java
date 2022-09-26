class Node {
    int data;
    Node next;
  }

class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int mid() {
            Node f = head;
            Node s = head;

            while (f.next != null && f.next.next != null) {
                f = f.next.next;
                s = s.next;
            }

            return s.data;
        }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {
       if(this.size() == 0) addLast(val);
       else {
         Node tba = new Node();
         tba.data = val;
         tba.next = head;
         head = tba;
         size ++;
       }
    }
  }


class Leet876 {
    public static int middleNode(LinkedList list) {
        Node s = list.head, f = list.head;
        int i = 0;
        while(f.next != null && f.next.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s.data;
    }

    public static void main(String[] args) {
        LinkedList head = new LinkedList();
        head.addLast(1);
        head.addLast(2);
        head.addLast(3);
        head.addLast(4);
        head.addLast(5);
        System.out.println(middleNode(head));
    }

    
    class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp2 = dummy;
        ListNode temp = head;
        while(temp != null){
            ListNode nn = new ListNode(temp.val);
            temp2.next = nn;
            temp2 = temp2.next;
            temp = temp.next;
        }
        dummy = dummy.next;
        ListNode head1=reverseList(dummy);
        while(head!=null){
            if(head.val!=head1.val) return false;
            head=head.next;
            head1=head1.next;
        }
        return true;
        
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode pre= null;
        ListNode curr= head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=pre;
            pre=curr;
            curr=forward;
        }return pre;
    }
}

}