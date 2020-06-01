class TreeNode15
{
    int val;
    TreeNode15 left;
    TreeNode15 right;

    TreeNode15(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class InvertBST {
    public TreeNode15 invertTree(TreeNode15 tree) {
        if(tree == null)
        {
            return null;
        }

        TreeNode15 left = invertTree(tree.left); 
        TreeNode15 right = invertTree(tree.right);

        // swap the value;
        left = tree.right;
        right = tree.left;

        return tree;

    }
}

class InvertBSTDmeo
{
    public static void main(String[] args) {
        InvertBST ib = new InvertBST();
        TreeNode15 tree = null;
        tree = new TreeNode15(4);
        tree.left = new TreeNode15(2);
        tree.right = new TreeNode15(7);
        tree.left.left = new TreeNode15(1);
        tree.right.left = new TreeNode15(6);
        tree.left.right = new TreeNode15(3);
        tree.right.right = new TreeNode15(9);

    }
}