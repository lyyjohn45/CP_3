//: In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different 
//: sizes which can slide onto any tower   The puzzle starts with disks sorted in ascending 
//: order of size from top to bottom (e g , each disk sits on top of an even larger one)  You 
//: have the following constraints: 
//: (A) Only one disk can be moved at a time 
//: (B) A disk is slid off the top of one rod onto the next rod  
//: (C) A disk can only be placed on top of a larger disk 
//: Write a program to move the disks from the first rod to the last using Stacks

public class HanoiTower {
	private Stack s;
	private int index;
	
	public HanoiTower (int i)
	{
		s = new Stack();
		index = i;
	}
	
	public int index ()
	{
		return index;
	}
	
	public void print ()
	{
		System.out.print("Tower " + index +" : ");
		s.print();
	}
	
	public void push (int i)
	{
		if(!s.isEmpty() && s.peek().val <= i)
		{
			System.out.println("errand move when trying to push " + i + " to tower " + this.index );
		}
		else
		{
			s.push(i);
		}
	}
	
	public void moveTopTo (HanoiTower destination)
	{
		Node temp = s.pop();
		System.out.println("move " + temp.val + " from tower " + this.index + " to tower " + destination.index());
		destination.push(temp.val);
	}
	
	public void moveDiskTo (int totalDisk, HanoiTower destination, HanoiTower buffer)
	{
		if(totalDisk > 0){
			moveDiskTo(totalDisk - 1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDiskTo(totalDisk - 1, destination, this);
		}
	}
}
