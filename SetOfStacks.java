import java.util.ArrayList;


public class SetOfStacks {
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	
	public SetOfStacks()
	{
		for(int i = 0; i < stacks.size(); i++)
		{
			
			stacks.toArray()[i] =new Stack();
		}
	}
	

	public void push(int t)
	{

		Stack last = getLaskStack();
		if(last.isAtCapacity())
		{
			Stack newStack = new Stack(t);
			stacks.add(newStack);
		}else
		{
			last.push(t);
		}
	}

	public Node pop()
	{
		if(stacks == null) return null;
		
		Node temp = getLaskStack().pop();
		System.out.println("current size of last stack: " + stacks.size());
		if(this.getLaskStack().size() == 0)
		{
			stacks.remove(stacks.size() -1);
		}
		return temp;
	}
	
	public Node popAt(int index)
	{
		return popShift(index, true);
	}
	
	private Node popShift(int index, boolean removeTop) {
		if(index > stacks.size() - 1)// when request a index that does not exist
		{
			return null;
		}
		
		Stack stack = stacks.get(index);		
		Node remove;
		
		if(removeTop)//the index of stack we are removing
		{
			remove = stack.pop();
		}else//the shifted stack
		{
			remove = stack.removeLast();
		}
		
		if(index < stacks.size() - 1)
		{
			//if not the last one, i push the last one behind me
			int v = popShift(index + 1, false).val;
			stack.push(v);
		}
		else if(stack.size() == 0)
		{
			//if i am empty, remove myslef.
			stacks.remove(index);
		}
		
		return remove;
	}

	private Stack getLaskStack() {
		//Grape the last stack from stacks object	
		return stacks.get(stacks.size() -1);
	}
	
	public void print ()
	{
		for(Stack s : stacks)
		{
			s.print();
			System.out.println("------------");
		}
	}
	
}
