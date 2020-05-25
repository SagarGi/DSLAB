import java.util.LinkedList;
import java.util.Queue;

class TreeNode7
{
    int val;
    TreeNode7 left;
    TreeNode7 right;

    TreeNode7(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class ValidataBinarySearchTree {

    public boolean isValidBST(TreeNode7 tree) {
        if(tree == null)
        {
            return true;
        }
        
        return true;
    }
}

class ValidataBinarySearchTreeDemo
{
    public static void main(String[] args) {
        TreeNode7 tree = null;
        ValidataBinarySearchTree vbst = new ValidataBinarySearchTree();
        tree = new TreeNode7(10);
        tree.left = new TreeNode7(5);
        tree.right = new TreeNode7(15);
        tree.right.left = new TreeNode7(6);
        tree.right.right = new TreeNode7(20);
        

        System.out.println(vbst.isValidBST(tree));



    }
}