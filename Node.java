
public class Node {
	public int val;
	public Node next;
	
	public Node (int x)
	{
		this.val = x;
		this.next = null;
	}
	
	public Node (int x, Node y)
	{
		this.val = x;
		this.next = y;
	}
	
}
