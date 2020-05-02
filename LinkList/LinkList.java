public class LinkList {

    NodeList head;

    public void insert(int data)
    {
        NodeList node = new NodeList();
        node.data = data;
        node.nextNode = null;
        // if first node;
        if(head == null)
        {
            head = node;
        }
        else
        {
            NodeList n = head;
            while(n.nextNode != null)
            {
                n = n.nextNode;
            }
            n.nextNode = node;
        }
    }

    public void insertAtStart(int data)
    {
        NodeList node = new NodeList();
        node.data = data;
        if(head == null)
        {
            node.nextNode = null;
            head = node;

        }
        else
        {
           node.nextNode = head;
           head = node;
        }
    }

    public void delete(int index)
    {
        if(index == 0)
        {
            head = head.nextNode;
        }
        else
        {
            NodeList n = head;
            for(int i = 0; i < index - 1; i++)
            {
                n = n.nextNode;
            }

            NodeList n1 = n.nextNode;
            n.nextNode = n1.nextNode;
           

        }
    }

    public void insertAtAny(int index, int data)
    {
        NodeList node = new NodeList();
        node.data = data;
      

        if(index == 0)
        {
            node.nextNode = head;
            head = node;
        }
        else
        {
            NodeList n = head;
            for(int i = 0; i < index - 1; i++)
            {
                n = n.nextNode;
            }
            node.nextNode = n.nextNode;
            n.nextNode = node;
        }

       
    }

    public void show()
    {
        NodeList node = head;
        while(node.nextNode != null)
        {
            System.out.println(node.data);
            node = node.nextNode;
        }
        System.out.println(node.data);
    }
}