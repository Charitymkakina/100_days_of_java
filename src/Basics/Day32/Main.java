package Day32;

public class Main {
      public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
    	
    	tree.insert(new Node(25));
    	tree.insert(new Node(20));
    	tree.insert(new Node(15));
    	tree.insert(new Node(10));
    	tree.insert(new Node(5));
    	tree.insert(new Node(45));
    	tree.insert(new Node(30));
    	tree.insert(new Node(40));
    	tree.insert(new Node(35));
    	
    	tree.display();
    }
}

