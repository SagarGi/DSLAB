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
        tree = new TreeNode8(1);
        tree.left = new TreeNode8(2);
        tree.left.left = new TreeNode8(3);
        tree.left.left.right = new TreeNode8(3);
        tree.left.right = new TreeNode8(4);
        tree.right = new TreeNode8(5);
        tree.right.right = new TreeNode8(6);

        DFSTreeStack st = new DFSTreeStack();
        st.stackDFSTree(tree);
    }
}