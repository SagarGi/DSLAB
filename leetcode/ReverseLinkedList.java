public class ReverseLinkedList
{
    //  it will be just a fuction that will return a list if list node
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


  public ListNode reverseLinkedList(ListNode head)
  {
      ListNode previous = null;
      while(head != null)
      {
        ListNode nextNode = head.next;
        head.next = previous;
        previous = head;
        head = nextNode;

      }

      return previous;
  }


 
    
}