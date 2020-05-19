class NodeTree
{
    int data;
    NodeTree left;
    NodeTree right;

    NodeTree(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Searcing {
    NodeTree node;

    Searcing()
    {
        node = null;
    }

    public boolean searchNodeInTree(NodeTree node, int value)
    {
        if(node == null)
        {
            return false;
        }

        // preorderTraversal

        if(node.data == value)
        {
            return true;
        }

        boolean leftAns = searchNodeInTree(node.left, value); // since it return a boolean value it needs to be angian return;
        if(leftAns)
        {
            return true;
        }
        
        boolean rightAns =  searchNodeInTree(node.right, value);

        return rightAns;
    }
}

class SearcingDemo
{
    public static void main(String[] args) {
        Searcing s = new Searcing();
        s.node = new NodeTree(0);
        s.node.left = new NodeTree(1);
        s.node.right = new NodeTree(2);
        s.node.left.left = new NodeTree(3);
        s.node.left.right = new NodeTree(4);
        s.node.left.left.left = new NodeTree(7);
        s.node.left.right.left= new NodeTree(8);
        s.node.left.right.right= new NodeTree(9);
        s.node.right.left= new NodeTree(5);
        s.node.right.right = new NodeTree(6);

        System.out.println(s.searchNodeInTree(s.node, 22)); 
        
    }
}