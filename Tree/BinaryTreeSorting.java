class Tree
{
    int data;
    Tree left = null;
    Tree right = null;
}

class BinaryTreeSorting
{
    public Tree createNode(int value)
    {
        Tree t = new Tree();
        t.data = value;
        t.left = null;
        t.right = null;

        return t;

    }

    public Tree insertValue(Tree tree, int value)
    {
        if(tree == null)
        {
            tree = createNode(value);
        }
        else if(value < tree.data)
        {
            tree.left = insertValue(tree.left, value);
        }
        else if(value > tree.data)
        {
            tree.right = insertValue(tree.right, value);
        }

        return tree;
    }

    // sorting the value of the tree using inorder traversal i.e LNR since left contains all smaller value and right contains all greater value
    // in binary search tree
    public void sortingTree(Tree tree)
    {
        if(tree == null)
        {
            return;
        }

        sortingTree(tree.left);
        System.out.println(tree.data);
        sortingTree(tree.right);
    }
}

class BinaryTreeSortingDemo
{
    public static void main(String[] args) {
        BinaryTreeSorting bts = new BinaryTreeSorting();
        Tree tree = null;
        tree = bts.insertValue(tree, 8);
        tree = bts.insertValue(tree, 3);
        tree = bts.insertValue(tree, 1);
        tree = bts.insertValue(tree, 10);
        tree = bts.insertValue(tree, 6);
        tree = bts.insertValue(tree, 4);
        tree = bts.insertValue(tree, 7);
        tree = bts.insertValue(tree, 14);
        tree = bts.insertValue(tree, 13);
        // System.out.println(tree.left.data);
        bts.sortingTree(tree);
    }
}