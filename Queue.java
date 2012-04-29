
public class Queue {
	public Node front;
	
	public Queue ()
	{
		front = null;
	}
	
	public Queue (int x)
	{
		front = new Node (x);
	} 
	
	public void enqueue (int x)
	{
		if(front == null)
		{
			front = new Node(x);
		}
		
		Node current = front;
		
		while(current.next != null)
		{
			current = current.next; 
		}
		
		current.next = new Node(x);
	}
	
	public Node dequeue (int x)
	{
		if(front == null)
		{
			return null;
		}else if(front.next == null)
		{
			Node temp = front;
			front = null;
			return temp;
		} 
		
		Node current = front;
		
		while(current.next.next != null)
		{
			current = current.next; 
		}
		
		Node temp = current.next;
		current.next = null;
		return temp;
	}
}
