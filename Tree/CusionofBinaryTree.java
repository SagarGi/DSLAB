import java.util.LinkedList;
import java.util.Queue;

class TreeNode5
{
    int val;
    TreeNode5 left;
    TreeNode5 right;

    TreeNode5(int val)
    {
        this.val = val;
        left = null;
        right = null;
    }
}

public class CusionofBinaryTree {
    public boolean isCousins(TreeNode5 tree, int x, int y) {
        if(tree == null)
        {
            return false;
        }

        Queue<TreeNode5> queue = new LinkedList<>();
        queue.add(tree);

        while(!queue.isEmpty())
        {
            int qSize = queue.size();
            boolean isX = false;
            boolean isY = false;
            for(int i = 0; i < qSize; i++)
            {
                TreeNode5 currentRoot = queue.poll();
                if(currentRoot.val == x)
                {
                    isX = true;
                }
                if(currentRoot.val == y)
                {
                    isY = true;
                }
                if(currentRoot.left != null && currentRoot.right != null)
                {
                    if(currentRoot.left.val == x && currentRoot.right.val ==y)
                    {
                        return false;
                    }
                    if(currentRoot.left.val == y && currentRoot.right.val == x)
                    {
                        return false;
                    }
                }
                if(currentRoot.left != null)
                {
                    queue.add(currentRoot.left);
                }
                if(currentRoot.right != null)
                {
                    queue.add(currentRoot.right);
                }
            }

            if(isX == true && isY == true)
            {
                return true;
            }
        }


        return false;
    }
}

class CusionofBinaryTreeDemo
{
    public static void main(String[] args) {
        CusionofBinaryTree cbt = new CusionofBinaryTree();
        TreeNode5 tree = null;
        tree = new TreeNode5(1);
        tree.left = new TreeNode5(2);
        tree.right = new TreeNode5(3);
        tree.right.right = new TreeNode5(4);
        tree.left.left = new TreeNode5(5);
        int x = 5, y = 4;
        System.out.println(cbt.isCousins(tree, x, y));
    }
}