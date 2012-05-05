
public class CP_3 {
	
	public static void main(String[] args) {
		//3.2
		//minStack s1 = new minStack();
		
		//s1.push(4);
		//s1.push(2);
		//s1.push(3);
		
		//s1.print();
		//s1.min();
		
		//3.3
		//SetOfStacks stacks = new SetOfStacks();
		
		//stacks.push(1);
		//stacks.push(2);
		//stacks.push(3);
		//stacks.push(3)
		//stacks.push(3)
		//stacks.push(3)


		//3.4
		/*HanoiTower t0 = new HanoiTower(0);
		HanoiTower t1 = new HanoiTower(1);
		HanoiTower t2 = new HanoiTower(2);
		
		for(int i = 2 ; i >= 0 ; i--)
		{
			t0.push(i);
		}
		
		//before shift
		t0.print();
		t1.print();
		t2.print();
		
		t0.moveDiskTo(3, t2, t1);

		//after shift
		t0.print();
		t1.print();
		t2.print();*/
		
		//3.5
		
		SQueue q = new SQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		
		q.print();
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		q.print();
	}

}
