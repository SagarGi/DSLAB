class ListNode10
{
    int val;
    ListNode10 next;

    ListNode10(int val)
    {
        this.val = val;
        next = null;
    }

}

public class LinkedListDeleteNode
{
    public ListNode10 insert(int val, ListNode10 list)
    {
        
        if(list == null)
        {
            return new ListNode10(val);
        }
        else
        {
            ListNode10 head = list;
            while(head.next != null)
            {
                head = head.next;
            }
            head.next = new ListNode10(val);
        }
       
        return list;
    }
    public void displayList(ListNode10 list)
    {
        ListNode10 head = list;
        while(head.next != null)
        {
            System.out.println(head.val);
            head = head.next;
        }

        System.out.println(head.val);
    }

    public void deleteNode(ListNode10 list, ListNode10 node) {
        ListNode10 head = list;
        ListNode10 helper = head.next;
        while(head.next.val != node.val)
        {
            head = head.next;
            helper = head.next;
        }
        head.next = helper.next;
    }
}

class LinkedListDeleteNodeDemo
{
    public static void main(String[] args) {
        ListNode10 list = null;
        ListNode10 node = new ListNode10(1);
        LinkedListDeleteNode  ld = new LinkedListDeleteNode();
        list = ld.insert(4, list);
        list = ld.insert(5, list);
        list = ld.insert(1, list);
        list = ld.insert(9, list);
        ld.deleteNode(list, node);
        ld.displayList(list);
    }
}