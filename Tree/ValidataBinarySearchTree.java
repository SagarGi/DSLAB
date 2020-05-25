
import java.util.Stack;

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
    
        Stack<TreeNode7> stack = new Stack<>();
        TreeNode7 currentNode = tree;

        TreeNode7 previousNode = new TreeNode7(Integer.MIN_VALUE);

        while(currentNode != null || !stack.isEmpty())
        {
            while(currentNode != null)
            {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            
            currentNode = stack.pop();
            if(previousNode.val > currentNode.val)
            {
                return false;
            }
            previousNode = currentNode; 

            currentNode = currentNode.right;
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
        // tree.left.left = new TreeNode7(1);
        // tree.left.right = new TreeNode7(6);
        tree.right = new TreeNode7(15);
        tree.right.right = new TreeNode7(20);
        tree.right.left = new TreeNode7(6);
        

        System.out.println(vbst.isValidBST(tree));



    }
}