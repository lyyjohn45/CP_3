
public class ThreeStacks {
	private int[] myList;
	private int top1 = 99;
	private int top2 = 199;
	private int top3 = 299;
	private int max;
	
	public ThreeStacks (int n)
	{
		myList = new int[n];
		
		max = n;
		top1 = (n/3 -1);
		top2 = (2*n/3 -1);
		top3 = (n -1);
	}
	
	public void push (int stackNum, int val)
	{
		if (top1 < 0 || top2 < max/3 || top3 < 2*max/3)
		{
			return;
		}
		
		if(stackNum == 0)
		{
			myList[top1] = val;
			top1--;
		}else if(stackNum == 1)
		{
			myList[top2] = val;
			top2--;
		}else
		{
			myList[top3] =val;
			top3--;
		}
	}
	
	public int pop (int stackNum)
	{
		int temp;
		
		if(stackNum == 0)
		{
			temp = top1;
			top1++;
			
		}else if(stackNum == 1)
		{
			temp = top2;
			top2++;

		}else
		{
			temp = top3;
			top3++;
		}
		
		return temp;
	}
	
	public int peek(int stackNum)
	{
		int temp;
		
		if(stackNum == 0)
		{
			temp = top1;
			
		}else if(stackNum == 1)
		{
			temp = top2;

		}else
		{
			temp = top3;
		}
		
		return temp;
	}
}
