class LinkedList {
    int data;
    LinkedList next;
}

public class LinkedSorting {
    public LinkedList add(LinkedList head, int value) {
        LinkedList l = new LinkedList();
        l.data = value;
        l.next = null;
        if (head == null) {
            head = l;
        } else {
            LinkedList node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = l;
        }

        return head;
    }

    public void headDisplay(LinkedList head) {
        LinkedList node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void sortList(LinkedList head) {
        if (head != null && head.next != null) {
            LinkedList index = head;
            while (index.next != null) {
                LinkedList node = index.next;
                while (node.next != null) {
                    if (index.data > node.data) {
                        // we swap the two
                        int temp = index.data;
                        index.data = node.data;
                        node.data = temp;
                    }
                    node = node.next;
                }
                // for last element comparision
                if (index.data > node.data) {
                    // we swap the two
                    int temp = index.data;
                    index.data = node.data;
                    node.data = temp;
                }

                index = index.next;
            }
        }

        else {
            System.out.println("The List is null!!");
        }

    }
}

class LinkedSortingDemo {
    public static void main(String[] args) {
        LinkedSorting ls = new LinkedSorting();
        LinkedList head = null;
        head = ls.add(head, 9);
        head = ls.add(head, 7);
        head = ls.add(head, 100);
        ls.sortList(head);
        ls.headDisplay(head);

    }
}