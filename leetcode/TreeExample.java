// this is a part of learning. it is not a problem to a solution

class RootNode
{
    int value;
    RootNode leftChild;
    RootNode rightChild;

    public RootNode(int valuefornode)
    {
        value = valuefornode;
        leftChild = rightChild = null;
    }
}

class MyTreeDemo
{
    RootNode root;

    public MyTreeDemo(int value)
    {
        root = new  RootNode(value);
    }

    public MyTreeDemo()
    {
        root = null;
    }

    public static void main(String args)
    {
        MyTreeDemo mtd = new MyTreeDemo();
        mtd.root = new RootNode(1);
        mtd.root.leftChild = new RootNode(2);
        mtd.root.rightChild = new RootNode(3);
        mtd.root.leftChild.leftChild = new RootNode(4);

        System.out.println(mtd.root);

    }
}