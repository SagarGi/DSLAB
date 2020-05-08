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

