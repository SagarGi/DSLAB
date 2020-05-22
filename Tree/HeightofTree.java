class TreeNodeHeight
{
    int data;
    TreeNodeHeight left;
    TreeNodeHeight right;

    TreeNodeHeight(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }

}

public class HeightofTree {

    public TreeNodeHeight createNewNode(int data)
    {
        TreeNodeHeight t1 = new TreeNodeHeight(data);
        return t1;
    }

    public TreeNodeHeight insertData(TreeNodeHeight tree, int data)
    {
        if(tree == null)
        {
            tree = createNewNode(data);
        }
        else if(data < tree.data)
        {
            tree.left = insertData(tree.left, data);
        }
        else if(data > tree.data)
        {
            tree.right = insertData(tree.right, data);
        }

        return tree;

    }

    public int findHeight(TreeNodeHeight tree)
    {
        int height = 0;
        if(tree == null)
        {
            return -1;
        }
        int leftHeight = findHeight(tree.left);
        int rightHeight = findHeight(tree.right);
        height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    } 
    
}

class HeightOfTreeDemo
{
    public static void main(String[] args) {
        
        HeightofTree hot = new HeightofTree();
        TreeNodeHeight tree = null;

        tree = hot.insertData(tree, 20);
        tree = hot.insertData(tree, 30);
        tree = hot.insertData(tree, 25);
        tree = hot.insertData(tree, 40);
        tree = hot.insertData(tree, 5);
        tree = hot.insertData(tree, 1);
        tree = hot.insertData(tree, 10);
        tree = hot.insertData(tree, 8);
        tree = hot.insertData(tree, 12);
        System.out.println(hot.findHeight(tree));
        

    }
}