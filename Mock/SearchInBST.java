class TreeNode22
{
    int val;
    TreeNode22 left;
    TreeNode22 right;


    TreeNode22(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class SearchInBST
{

    public TreeNode22 searchBST(TreeNode22 tree, int val) {
        
        if(tree == null)
        {
            return null;
        }
        if(tree.val == val)
        {
            return tree;
        }

        if(tree.val > val)
        {
             return searchBST(tree.left, val);
        }
        else
        {
            return searchBST(tree.right, val);
        }
    }
}

class SearchInBSTDemo
{
    public static void main(String[] args) {
        TreeNode22 tree = null;
        tree = new TreeNode22(4);
        tree.left = new TreeNode22(2);
        tree.right = new TreeNode22(7);
        tree.left.left = new TreeNode22(1);
        tree.left.right = new TreeNode22(3);
        SearchInBST s = new SearchInBST();
        int val = 2;
        TreeNode22 result = s.searchBST(tree, val);
    }
}