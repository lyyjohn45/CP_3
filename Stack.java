
public class Stack {
	public Node top;
	
	public Stack ()
	{
		top = null;
	}
	
	public Stack (int x)
	{
		top = new Node (x);
	}
	
	public void push (int x)
	{
		top = new Node(x, top);
	}
	
	public Node peek ()
	{
		if (top == null)
		{
			return null;
		}
		
		return top;
	}
	
	public Node pop()
	{
		if(this.peek() == null)
		{
			return null;
		}
		else if (top.next == null)
		{
			Node temp = top;
			top = null;
			return temp;
		}else
		{
			Node temp = top.next;
			top.next = top.next.next;
			return temp;
		}
	}
}
