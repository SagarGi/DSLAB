import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode12
{
    int val;
    TreeNode12 left;
    TreeNode12 right;

    TreeNode12(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class LeftSum {

    public boolean leafNode(TreeNode12 tree)
    {
        if(tree == null)
        {
            return false;
        }

        if(tree.left == null && tree.right == null)
        {
            return true;
        }
        return false;
    }

    public void traverse(TreeNode12 tree, List<Integer> list)
    {
        // check leaf node or not
        if(tree == null)
        {
            return;
        }
        if(leafNode(tree.left))
            {
                list.add(tree.left.val);
            }
        else
            {
                traverse(tree.left, list);
            }
            
            traverse(tree.right, list);
        
       
    }
    public int sumOfLeftLeaves(TreeNode12 tree) {
        int result = 0;
        List<Integer> list = new ArrayList<>();
        traverse(tree, list);
        System.out.println(list);

        for(Integer i : list)
        {
            result = result + i;
        }
        return result;
    }
}


class LeftSumDemo
{
    public static void main(String[] args) {
        TreeNode12 tree = null;
        tree = new TreeNode12(3);
        tree.left = new TreeNode12(9);
        tree.right = new TreeNode12(20);
        tree.right.left = new TreeNode12(15);
        tree.right.right = new TreeNode12(7);

        LeftSum ls = new LeftSum();
        System.out.println(ls.sumOfLeftLeaves(tree));
        
    }
}
