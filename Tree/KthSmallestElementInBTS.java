import java.util.ArrayList;
import java.util.List;

class TreeNode1
{
    int data;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class KthSmallestElementInBTS {

    List<Integer> list = new ArrayList<>();
    public TreeNode1 createNewNode(int value)
    {
        TreeNode1 t = new TreeNode1(value);
        return t;
    }

    //  to add items;
    public TreeNode1 addItem(TreeNode1 tree, int value)
    {
        if(tree == null)
        {
            tree = createNewNode(value);
        }
        else if(value < tree.data)
        {
            tree.left = addItem(tree.left, value);
        }
        else if(value > tree.data)
        {
            tree.right = addItem(tree.right, value);
        }

        return tree;
    }

    public List<Integer> traverse(TreeNode1 tree , ArrayList<Integer> list)
    {
       if(tree == null)
       {
           return list;
       }

       traverse(tree.left, list);
       list.add(tree.data);
       traverse(tree.right, list);

       return list;
    }


    public int kthSmallest(TreeNode1 tree, int k) {
     
        List<Integer> list = new ArrayList<>();
        list = traverse(tree, new ArrayList<>());
        return list.get(k-1);
    }
    
}

class KthSmallestElementInBTSDemo
{
    public static void main(String[] args) {
        TreeNode1 tree = null;
        int k = 3;
        KthSmallestElementInBTS kbts =  new KthSmallestElementInBTS();
        tree = kbts.addItem(tree, 5);
        tree = kbts.addItem(tree, 3);
        tree = kbts.addItem(tree, 2);
        tree = kbts.addItem(tree, 4);
        tree = kbts.addItem(tree, 1);
        tree = kbts.addItem(tree, 6);
        // System.out.println(tree.right.data);
        System.out.println(kbts.kthSmallest(tree, k));
        // System.out.println(kbts.list);
    }
}