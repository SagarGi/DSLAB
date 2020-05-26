import java.util.Stack;

// define a node
class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) 
    { 
        this.data = data; 
        left = right = null; 
    } 
}

public class BinaryTreeTraversal {

    // refrence of tree i.e the root node

    TreeNode node;

    BinaryTreeTraversal()
    {
        node = null;
    }

    // public TreeNode insertNewNode(TreeNode node, int value)
    // {
    //     TreeNode tn = new TreeNode();
    //     tn.data = value;
    //     tn.left = null;
    //     tn.right = null;

    //     return tn;
    // }
    
    // public TreeNode insertNode(TreeNode node , int value)
    // {
    //     if(node == null)
    //     {
    //         return insertNewNode(node, value);
    //     }
    //     else if(value < node.data)
    //     {
    //         node.left = insertNode(node.left, value);
    //     }
    //     else if(value > node.data)
    //     {
    //         node.right = insertNewNode(node.right, value);
    //     }

    //     return node;
    // }

    // Tree Traversal
    //  In-Order traversal

    public void preOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        else
        {

            System.out.print(node.data + "\t");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.println(node.data + "\t");
        }
    }

    public void inOrderTraversal(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        else
        {
            inOrderTraversal(node.left);
            System.out.println(node.data);
            inOrderTraversal(node.right);
        }
    }


    public void preOrderTraversalIterative(TreeNode tree)
    {
        if(tree == null)
        {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
    
        stack.push(tree);
        while(!stack.isEmpty())
        {
            TreeNode currentNode = stack.pop();
            System.out.println(currentNode.data);
            if(currentNode.left != null && currentNode.right != null)
            {
                stack.push(currentNode.right);
                stack.push(currentNode.left);
            }
            if(currentNode.left != null && currentNode.right == null)
            {
                stack.push(currentNode.left);
            }
            if(currentNode.left == null && currentNode.right != null)
            {
                stack.push(currentNode.right);
            }
        }
    }
}

class BinaryTreeTraversalDemo
{
    public static void main(String[] args) {
        BinaryTreeTraversal btt = new BinaryTreeTraversal();
        btt.node = new TreeNode(1);
        btt.node.left = new TreeNode(2);
        btt.node.right = new TreeNode(3);
        btt.node.left.left = new TreeNode(4);
        btt.node.left.right = new TreeNode(5);
        btt.node.left.right.right = new TreeNode(6);
        btt.node.left.right.left = new TreeNode(8);

        btt.preOrderTraversalIterative(btt.node);
        
    }
}