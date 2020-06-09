import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode20
{
    int val;
    ListNode20 next;

    ListNode20(int val)
    {
        this.val = val;
        next = null;
    }
}

public class AddTwoLinkedList {
    public ListNode20 add(ListNode20 list, int val)
    {
        
        ListNode20 l = new ListNode20(val);
        if(list == null)
        {
            list = l;

        }
        else
        {
            ListNode20 head = list;

            while(head.next != null)
            {
                head = head.next;
            }
            head.next = l;
        }
       

        return list;
    }
    public List<Integer>  getElement(ListNode20 list , ArrayList<Integer> l)
    {
        ListNode20 head = list;
        while(head.next != null)
        {
            l.add(head.val);
            head = head.next;
        }
        l.add(head.val);
        return l;
    } 


    public ListNode20 addTwoNumbers(ListNode20 l1, ListNode20 l2) {

        List<Integer> list1 = getElement(l1, new ArrayList<>());
        List<Integer> list2 = getElement(l2, new ArrayList<>());
        String num1 = "";
        String  num2 = ""; 

        for(Integer i : list1)
        {
            num1 = i + num1;
        }

        for(Integer i : list2)
        {
            num2 = i + num2;
        }

    //   now add String
    int i = num1.length() - 1;
    int j = num2.length() - 1;

    StringBuilder sb = new StringBuilder();

    int carry = 0;

    while(i >= 0 || j >= 0)
    {
        int sum = carry;

        if(i >= 0)
        {
            sum = sum + num1.charAt(i) - '0';
            i--;
        }
        if(j >= 0)
        {
            sum = sum + num2.charAt(j) - '0';
            j--;
        }

        sb.append(sum % 10);
        carry = sum / 10;
    }

    if(carry != 0)
    {
        sb.append(carry);
    }

        ListNode20 list = null;
        for(int k = 0; k < sb.length(); k++)
        {
            list = add(list, sb.charAt(k) - '0');
        }
        return list;
    }


    public ListNode20 mergeTwoLists(ListNode20 l1, ListNode20 l2) {
        ListNode20 list = null;
        ListNode20 head1 = l1;
        ListNode20 head2 = l2;
        
        while(head1 != null && head2 != null)
        {
            if(head1.val < head2.val)
            {
                list = add(list, head1.val);
                head1 = head1.next;
            }
            else
            {
                list = add(list, head2.val);
                head2 = head2.next;
            }
        }

        while(head1 != null)
        {
                    list = add(list, head1.val);
                    head1 = head1.next;
        }

        while(head2 != null)
        {
            list = add(list, head2.val);
            head2 = head2.next;
        }

        return list;
    }

    public void display(ListNode20 list)
    {
        ListNode20 head = list;

        while(head.next != null)
        {
            System.out.println(head.val);
            head = head.next;
        }

        System.out.println(head.val);
    }
}

class AddTwoLinkedListDemo
{
    public static void main(String[] args) {
        ListNode20 list1 = null;
        AddTwoLinkedList a = new AddTwoLinkedList();
        list1 = a.add(list1 , 1);
        list1 = a.add(list1, 2);
        list1 = a.add(list1, 4);

        ListNode20 list2 = null;
        list2 = a.add(list2 , 1);
        list2 = a.add(list2, 3);
        list2 = a.add(list2, 4);

      ListNode20 mergedList = a.mergeTwoLists(list1, list2);
      a.display(mergedList);



    }
}