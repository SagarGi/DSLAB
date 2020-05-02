
public class Main {

    public static void main(String args[])
    {
        LinkList ll =new LinkList();
        ll.insertAtStart(11);
        ll.insertAtStart(3);
        ll.insert(33);
        ll.insert(44);
        ll.insertAtAny(0, 200);
        ll.delete(1);
        ll.delete(3);
        ll.show();
    }
    
}