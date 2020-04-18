// creating node

class Node{
    int data;
    Node leftChild, rightChild;
}

class RequiredMethods
{
    public Node createNewNode(int k)
    {
        Node a = new Node();
        a.data = k;
        a.leftChild = null;
        a.rightChild = null;

        return a;
    }
    // inserting elements in tree
    public Node insertData(Node node, int data)
    {
        if(node == null)
        {
            return createNewNode(data);
        }

        if(data < node.data)
        {
            node.leftChild = insertData(node.leftChild , data);
        }
        else if (data > node.data)
        {
            node.rightChild = insertData(node.rightChild, data);
        }

        return node;
    }


}



public class BinarySearchTree {

    public static void main(String arg[])
    {
        RequiredMethods rm = new RequiredMethods();
        Node root = null;
        Node result = rm.insertData(root, 8);
        System.out.println(result.data);
        System.out.println(result.leftChild);
        System.out.println(result.rightChild);
        Node result1 = rm.insertData(root, 3);
        System.out.println(result1.data);
        System.out.println(result1.leftChild);
        System.out.println(result1.rightChild);
        

    }

}