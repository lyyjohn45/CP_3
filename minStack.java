
public class minStack {
	public Stack myStack;
	public Stack minTrack;
	
	public minStack()
	{
		myStack = new Stack();
		minTrack = new Stack();
	} 
	
	public void push(int x)
	{
		if(minTrack.top == null)
		{
			minTrack.push(x);
		}else if(minTrack.peek().val > x)
		{
			minTrack.push(x);
		}
		myStack.push(x);
	}
	
	public Node pop()
	{
		if(minTrack.peek().val == myStack.peek().val)
		{
			minTrack.pop();
		}
		
		return myStack.pop();
	}
	
	public int min()
	{
		System.out.print(minTrack.peek().val);
		System.out.println("");
		return minTrack.peek().val;
	}
	
	public void print()
	{
		myStack.print();
	}
}
