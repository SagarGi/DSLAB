import java.util.Stack;

class TreeNode8
{
    int val;
    TreeNode8 left;
    TreeNode8 right;

    TreeNode8(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}


public class DFSTreeStack {

    // inorder sorting in bst without recursion

    public void inorderSorting(TreeNode8 tree)
    {
        Stack<TreeNode8> stack = new Stack<>();
        TreeNode8 currentNode = tree;

        while(currentNode != null || !stack.isEmpty())
        {
            // reach to the leftmost node
            while(currentNode != null)
            {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            currentNode = stack.pop();
            System.out.println(currentNode.val + "   ");
            currentNode = currentNode.right;
        }
    }

    // with recursion
    public void stackDFSTree(TreeNode8 tree)
    {
        Stack<TreeNode8> stack = new Stack<>();
        stack.add(tree);
        while(!stack.isEmpty())
        {
            TreeNode8 temp = stack.pop();
            System.out.println(temp.val);
            if(temp.right != null)
            {
                stack.add(temp.right);
            }
            if(temp.left != null)
            {
                stack.add(temp.left);
            }
           
        }
    }
}

class DFSTreeStackDemo
{
    public static void main(String[] args) 
    {
        TreeNode8 tree = null;
        tree = new TreeNode8(8);
        tree.left = new TreeNode8(5);
        tree.left.left = new TreeNode8(1);
        tree.left.right = new TreeNode8(6);
        tree.right = new TreeNode8(10);
        tree.right.right = new TreeNode8(16);
        tree.right.left = new TreeNode8(9);

        DFSTreeStack st = new DFSTreeStack();
        st.inorderSorting(tree);
    }
}