import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

class TreeNode111
{
    int val;
    TreeNode111 left;
    TreeNode111 right;

    TreeNode111(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class TwoSumBinaryTree
{
    public List<Integer> dfsElements(TreeNode111 tree , List<Integer> list)
    {
        if(tree == null)
        {
            return null;
        }
        dfsElements(tree.left, list);
        list.add(tree.val);
        dfsElements(tree.right, list);

        return list;
    }
    public boolean findTarget(TreeNode111 tree, int k) {
        
        List<Integer> list = new ArrayList<>();
        list = dfsElements(tree, list);

        int i = 0;
        int j = list.size() - 1;

        while(i < j)
        {
            int temp = list.get(i) + list.get(j);
            if(temp == k)
            {
                return true;
            }
            if(temp > k)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        System.out.println(list);
        return false;
    }
}

class TwoSumBinaryTreeDemo
{
    public static void main(String[] args) {
        TreeNode111 tree = null;
        tree = new TreeNode111(5);
        tree.left = new TreeNode111(3);
        tree.right = new TreeNode111(6);
        tree.right.right = new TreeNode111(7);
        tree.left.left = new TreeNode111(2);
        tree.left.right = new TreeNode111(4);
        int k = 28;
        TwoSumBinaryTree tb = new TwoSumBinaryTree();
        System.out.println(tb.findTarget(tree, k));
    }
}