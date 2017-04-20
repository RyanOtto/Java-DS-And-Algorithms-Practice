public class BinaryTree
{
    private static BSTNode root;

    public BinaryTree(int data){
        root = new BSTNode(data);
    }

    public void add(BSTNode parent, BSTNode child, String orientation){
        if (orientation.equals("left"))	parent.setLeft(child);
        else parent.setRight(child);
    }
    
    public BSTNode getRoot(){
    	return root;
    }
}