import javax.lang.model.util.ElementScanner6;

class NodeBinaryTree
{
    int data;
    NodeBinaryTree leftNode;
    NodeBinaryTree rightNode;
}

class BinaryTreeOperation
{
    public NodeBinaryTree createNewNode(int k)
    {
        NodeBinaryTree nb = new NodeBinaryTree();
        nb.data = k;
        nb.leftNode = null;
        nb.rightNode = null;

        return nb;
    }
    public NodeBinaryTree insert(NodeBinaryTree node , int value)
    {
        if(node == null)
        {
           node = createNewNode(value);
        }
        if(value < node.data)
        {
            node.leftNode = insert(node.leftNode, value);
        }
        else if(value > node.data)
        {
            node.rightNode = insert(node.rightNode, value);
        }
        return node;
    }


    // deletion in binary search tree

    public NodeBinaryTree deleteNode(NodeBinaryTree node, int value)
    {
        if(node == null)
        {
            return null;
        }

        if(value < node.data)
        {
            node.leftNode = deleteNode(node.leftNode, value);
        }
        else if(value > node.data)
        {
            node.rightNode = deleteNode(node.rightNode, value);
        }
        else
        {
            //  it is the condition where the  the ndoe value is itself
            if(node.leftNode == null)
            {
                return node.rightNode;
            }
            else if(node.rightNode == null)
            {
                return node.leftNode;
            }

            // we traverse right part of tree for minimum value
            node.data = minimumValueOfRight(node.rightNode);
            node.rightNode = deleteNode(node.rightNode, node.data);
        }
        return node;
    } 

    // calculate minimum value from right
    public int minimumValueOfRight(NodeBinaryTree node)
    {
        int minimum = node.data;
        while(node.leftNode != null)
        {
            minimum = node.leftNode.data;
            node = node.leftNode;
        }

        return minimum;
    }
}

public class BinaryTree {

    public static void main(String[] args) {
        BinaryTreeOperation bto = new BinaryTreeOperation();
        NodeBinaryTree root = null;
        root = bto.insert(root, 8);
        root = bto.insert(root, 3);
        root = bto.insert(root, 20);
        root = bto.insert(root, 36);
        root = bto.insert(root, 76);
        root = bto.insert(root, 100);
        root = bto.insert(root, 34);
    }
}

// recursion is key in binary search tree

