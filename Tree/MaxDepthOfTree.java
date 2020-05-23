class TreeNode4
{
    int val;
    TreeNode4 left;
    TreeNode4 right;

    TreeNode4(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}
public class MaxDepthOfTree
{
    public int maxDepth(TreeNode4 tree) {
        if(tree == null)
        {
            return 0;
        }

        int leftDepth = maxDepth(tree.left);
        int rightDepth = maxDepth(tree.right);
        
        return Math.max(leftDepth, rightDepth) + 1;

    }

    
    public int minDepth(TreeNode4 tree)
    {
        if(tree == null)
        {
            return 0;
        }
        if(tree.left == null && tree.right == null)
        {
            return 1;
        }

        int leftDepth = Integer.MAX_VALUE;
        int rightDepth = Integer.MAX_VALUE;

        if(tree.left != null)
        {
            leftDepth = minDepth(tree.left);
        }
        if(tree.right != null)
        {
            rightDepth = minDepth(tree.right);
        }
        return Math.min(leftDepth, rightDepth) + 1;
    }
}

class MaxDepthOfTreeDemo
{
    public static void main(String[] args) {
        TreeNode4 tree = null;
        tree = new TreeNode4(3);
        tree.left = new TreeNode4(9);
        // tree.right = new TreeNode4(20);
        // tree.right.right = new TreeNode4(7);
        // tree.right.left = new TreeNode4(15);

        MaxDepthOfTree mt = new MaxDepthOfTree();
        System.out.println(mt.minDepth(tree));
    }
}