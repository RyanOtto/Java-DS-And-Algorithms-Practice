public class BinaryTree
{
    private static BSTNode root;

    public BinaryTree(int data){
        root = new BSTNode(data);
    }

    
    void insert(int key) {
      insert(root, key);
    }

    
    public BSTNode search(int key){
    	return search(root, key);
    }
    
    
    BSTNode search(BSTNode current, int key){
    	if(current==null || current.getKey()==key) return current;
    	else if(key < current.getKey()) return search(current.getLeft(), key);
    	else return search(current.getRight(), key);
    }

    
    BSTNode insert(BSTNode current, int key) {
        if (current == null) {
            current = new BSTNode(key);
            return current;
        }
        if (key < current.getKey()) current.left = insert(current.left, key); //If less than current, go left
        else if (key > current.getKey()) current.right = insert(current.right, key); //If more than current, go right
        return current;
    }
    
    
    public BSTNode getRoot(){
    	return root;
    }
    
    
    public void inOrder(){
    	  inOrder(root);
      	  System.out.println("");
    	}
    
    
    private void inOrder(BSTNode current){
    	  if(current==null) return;
    	  
    	  inOrder(current.getLeft());
    	  System.out.print(current.getKey() + " ");
    	  inOrder(current.getRight());
    	}
    
    
    public void preOrder(){
    	preOrder(root);
    	System.out.println("");
    }
    
    
	private void preOrder(BSTNode current){
  	  if(current==null) return;

	  System.out.print(current.getKey() + " ");
	  inOrder(current.getLeft());
	  inOrder(current.getRight());
	}
    
	
    public void postOrder(){
    	postOrder(root);
    	System.out.println("");
    }
    
    
    private void postOrder(BSTNode current){
  	  if(current==null) return;

	  inOrder(current.getLeft());
	  inOrder(current.getRight());
	  System.out.print(current.getKey() + " ");
    }
}