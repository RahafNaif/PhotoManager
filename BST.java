package PA1;

class BSTNode<T> {
	String key;
	public T data;
	public BSTNode<T> left, right;

	public BSTNode(String key, T data) {
		this.key = key;
		this.data = data;
		left = right = null;
	}

	@Override
	public String toString() {
		return "data=" + data;
	}
	
	
}

public class BST<T> {

	private BSTNode<T> root, current;

	public BST() {
		current = root = null;
	}

	public void clear() {
		current = root = null;
	}
	
	public boolean empty() {
		return root == null;
	}

	public boolean full() {
		return false;
	}

	public T retrieve() {
		return current.data;
	}

	public boolean findKey(String k) {

		BSTNode<T> p = root;
		while (p != null) {
			current = p;
			if (k.compareTo(p.key)==0) {
				return true;
			} else if (k.compareTo(p.key)<0) {
				p = p.left;
			} else {
				p = p.right;
			}
		}
		return false;
	}

	public boolean insert(String k, T val) {
		if (root == null) {
			current = root = new BSTNode<T>(k, val);
			return true;
		}

		BSTNode<T> p = current;
		if (findKey(k)) {
			current = p;
			return false;
		}

		BSTNode<T> tmp = new BSTNode<T>(k, val);
		if (k.compareTo(current.key)<0) {
			current.left = tmp;
		} else {
			current.right = tmp;
		}
		current = tmp;
		return true;
	}

	public boolean removeKey(String k) {

		// Search for k
		String k1 = k;
		BSTNode<T> p = root;
		BSTNode<T> q = null; // Parent of p
		while (p != null) {

			if (k1.compareTo(p.key) < 0) {
				q =p;
				p = p.left;
			} else if (k1.compareTo(p.key) > 0) {
				q = p;
				p = p.right;
			} else { // Found the key

				// Check the three cases
				if ((p.left != null) && (p.right != null)) { // Case 3: two
																// children

					// Search for the min in the right subtree
					BSTNode<T> min = p.right;
					q = p;
					while (min.left != null) {
						q = min;
						min = min.left;
					}
					p.key = min.key;
					p.data = min.data;
					k1 = min.key;
					p = min;
					// Now fall back to either case 1 or 2
				}

				// The subtree rooted at p will change here
				if (p.left != null) { // One child
					p = p.left;
				} else { // One or no children
					p = p.right;
				}

				if (q == null) { // No parent for p, root must change
					root = p;
				} else {
					if (k1.compareTo(q.key) < 0) {
						q.left = p;
					} else {
						q.right = p;
					}
				}
				current = root;
				return true;

			} 
		}

		return false; // Not found
	}
	
	void print() {
		printR(root);
	}
	
	private void printR(BSTNode<T> p) {
		if (p==null)
			return;
		printR(p.left);
		System.out.println(p.key);
		System.out.println("= "+p.data);
		printR(p.right);
	}
	
	LinkedList<String> keys(){
		LinkedList<String> keyList = new LinkedList<String>();
		findKeys(keyList,root);
		return keyList;
	}
	
	private void findKeys(LinkedList<String> t,BSTNode<T> p) {
		if(p==null)
			return;
		findKeys(t,p.left);
		t.insert(p.key);
		findKeys(t,p.right);
	}
	
	LinkedList<BSTNode> findLeastPath(String key){
		LinkedList<BSTNode> nodes = new LinkedList<BSTNode>();
		findPath(nodes,root,key);
		return nodes;
	}
	
	private void findPath(LinkedList<BSTNode> l,BSTNode<T> p,String k) {
		
		if(p==null || p.key.equals(k))
			return;
		l.insert(p);
		if(k.compareTo(p.key)>0)	{
			findPath(l,p.right,k);
		}else {
			findPath(l,p.left,k);
		}
	}
	
	void inorder() {
		if (empty())
			System.out.println("Empty Tree.");
		else
			inorder((BSTNode<LinkedList<Photo>>) root);
	}

	// recursively traverse the BST
	void inorder(BSTNode<LinkedList<Photo>> root) {
		if (root != null) {
			inorder(root.left);
			System.out.println("KEY:" + root.key + " ");
			System.out.println();
			display(root.data);
			inorder(root.right);
		}
	}
	
	public void display(LinkedList<Photo> l) {
		if (l.empty())
			System.out.println("No List");
		else {
			l.findFirst();
			while (!l.last()) {
				System.out.println(l.retrieve().getPath() + " ");
				l.findNext();
			}
			System.out.println(l.retrieve().getPath() + " ");
			System.out.println("__________");
		}
	}
	
	void findRoot() {
		current = root;
	}

	
}
