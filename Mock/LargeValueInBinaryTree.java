import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode9
{
    int val;
    TreeNode9 left;
    TreeNode9 right;

    TreeNode9(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }

}

public class LargeValueInBinaryTree {

    public List<Integer> largestValues(TreeNode9 tree) {

           
            List<Integer> list = new ArrayList<>();
            Queue<TreeNode9> q = new LinkedList<>();
            if(tree == null)
            {
                return list;
            }
            q.add(tree);
            while(!q.isEmpty())
            {
                int size = q.size();
                int max = Integer.MIN_VALUE;
                for(int i = 0; i < size; i++)
                {
                    TreeNode9 temp = q.poll();
                    if(temp.left != null)
                    {
                        q.add(temp.left);
                    }
                    if(temp.right != null)
                    {
                        q.add(temp.right);
                    }

                    if(temp.val > max)
                    {
                        max = temp.val;
                    }
                }
                list.add(max);
            }
            return list;
    }
}

class LargeValueInBinaryTreeDemo
{
    public static void main(String[] args) {
        TreeNode9 tree = null;
        tree = new TreeNode9(1);
        tree.left = new TreeNode9(3);
        tree.right = new TreeNode9(2);
        tree.left.left = new TreeNode9(5);
        tree.left.right = new TreeNode9(3);
        tree.right.right = new TreeNode9(9);

        LargeValueInBinaryTree lg = new LargeValueInBinaryTree();
        System.out.println(lg.largestValues(tree));

    }
}