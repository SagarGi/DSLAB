public class OddEvenLinkedList {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) 
             { 
                 this.val = val;
             }
             ListNode(int val, ListNode next)
            { 
                  this.val = val; this.next = next; 
            }
         }


         public ListNode oddEvenList(ListNode head)
         {
           ListNode odd = head;
           ListNode even = head.next;
           ListNode firstEven = even;

           while(odd != null && even != null)
           {
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
           }

        //    at last the odd must point to the first even node;
        odd.next = firstEven;

        return odd;

         }
}