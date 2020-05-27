import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode11
{
    int val;
    TreeNode11 left;
    TreeNode11 right;

    TreeNode11(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class LeafSimilar {

    public void postOrderTraversalMethod(TreeNode11 tree, List<Integer> list)
    {
        if(tree == null)
        {
            return;
        }
        if(tree.left == null && tree.right == null)
        {
            list.add(tree.val);
        }

        postOrderTraversalMethod(tree.left ,list);
        postOrderTraversalMethod(tree.right, list);
      
    }
    public boolean leafSimilar(TreeNode11 tree1, TreeNode11 tree2)
    {

        if(tree1 == null || tree2 == null)
        {
            return false;
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        postOrderTraversalMethod(tree1, list1);
        postOrderTraversalMethod(tree2, list2);
        if(list1.equals(list2))
        {
            return true;
        }
        return false;
    }
}

class LeafSimilarDemo
{
    public static void main(String[] args) {
        TreeNode11 tree1 = null;
        tree1 = new TreeNode11(3);
        tree1.left = new TreeNode11(5);
        tree1.right = new TreeNode11(1);
        tree1.left.left = new TreeNode11(6);
        tree1.left.right = new TreeNode11(2);
        tree1.left.right.left = new TreeNode11(7);
        tree1.left.right.right = new TreeNode11(4);
        tree1.right.left = new TreeNode11(9);
        tree1.right.right = new TreeNode11(8);
        TreeNode11 tree2 = null;
        tree2 = new TreeNode11(3);
        tree2.left = new TreeNode11(5);
        tree2.right = new TreeNode11(1);
        tree2.left.left = new TreeNode11(6);
        tree2.left.right = new TreeNode11(7);
        tree2.right.left = new TreeNode11(4);
        tree2.right.right = new TreeNode11(2);
        tree2.right.right.left = new TreeNode11(9);
        tree2.right.right.right = new TreeNode11(8);
        

        LeafSimilar ls = new LeafSimilar();
        System.out.println(ls.leafSimilar(tree1, tree2));
    }
}