
public class SQueue {
	private Stack s;
	private Stack helper;
	
	public SQueue()
	{
		s = new Stack();
		helper = new Stack();
	}
	
	public int peek()
	{
		return s.peek().val;
	}
	
	public void enqueue(int i)
	{
		s.push(i);
	}
	
	public Node dequeue()
	{
		while(!s.isEmpty())
		{
			helper.push(s.pop().val);
		}
		
		Node temp = helper.pop();
		
		while(!helper.isEmpty())
		{
			s.push(helper.pop().val);
		}
		
		return temp;
	}
	
	public void print()
	{
		s.print();
	}
}
