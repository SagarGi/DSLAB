class TreeNode6
{
    int val;
    TreeNode6 left;
    TreeNode6 right;

    TreeNode6(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class ReturnNode
{
    public TreeNode6 addNode(TreeNode6 tree, int val)
    {
       if(tree == null)
       {
           TreeNode6 t = new TreeNode6(val);
           tree = t; 
       }

       if(val < tree.val)
       {
           tree.left = addNode(tree.left, val);
       }
       else if(val > tree.val)
       {
           tree.right = addNode(tree.right, val);
       }

       return tree;
    } 

    public TreeNode6 bstFromPreorder(int[] preorder) {
        TreeNode6 tree = null;
        for(int i = 0; i < preorder.length; i++)
        {
            tree = addNode(tree, preorder[i]);
        }
        return tree;
    }
}

class ReturnNodeDemo
{
    public static void main(String[] args) {
        int preorder[] = {8,5,1,7,10,12};
        ReturnNode rn = new ReturnNode();
        TreeNode6 resultTree = rn.bstFromPreorder(preorder);

        System.out.println(resultTree.val);
    }
}