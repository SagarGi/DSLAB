import java.util.ArrayList;
import java.util.List;

class TreeNode2
{
    int val;
    TreeNode2 left;
    TreeNode2 right;

    TreeNode2(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class SameTreeLeetCode {
    public List<Integer> inorderTraversal(TreeNode2 tree, ArrayList<Integer> list)
    {
        if(tree == null)
        {
            list.add(0);
            return list;
        }
        list.add(tree.val);
        inorderTraversal(tree.left, list);
        inorderTraversal(tree.right, list);

        return list;
    }
    public boolean isSameTree(TreeNode2 p, TreeNode2 q) {

        List<Integer> l1 = inorderTraversal(p, new ArrayList<>());
        List<Integer> l2 = inorderTraversal(q, new ArrayList<>());

        System.out.println(l1);
        System.out.println(l2);

        if(l1.equals(l2))
        {
            return true;
        }
        return false;
    }
}

class SameTreeLeetCodeDemo
{
    public static void main(String[] args) {
        SameTreeLeetCode stl = new SameTreeLeetCode();
        TreeNode2 p = null;
        p = new TreeNode2(1);
        p.left = new TreeNode2(1);
        // p.right = new TreeNode2(3);
        TreeNode2 q = null;
        q = new TreeNode2(1);
        // q.left = new TreeNode2(2);
        q.right = new TreeNode2(1);
        System.out.println(stl.isSameTree(p, q));
    }
}