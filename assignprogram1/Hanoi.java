class Hanoi
{
	class Stack
	{
		int capacity;
		int top;
		int array[];
	}

	Stack createStack(int capacity)
	{
		Stack stack=new Stack();
		stack.capacity=capacity;
		stack.top=-1;
		stack.array=new int [capacity];
		return stack;
	}
	
	//stack is full
	boolen isFull(Stack stack)
	{
		return (stack.top==stack.capacity-1);

	}

	//stack is empty
	boolen isEmpty(Stack stack)
	{
		return(stack.top==-1);
	}

	//add into stack
	void push(Stack stack, int item)
	{
		if(isFull(stack))
			return;
		item=stack(++stack.top);
	}

	//remove from stack
	int pop(Stack stack)
	{
		if(isEmpty(stack))
			return Integer.MIN_VAl;
			return stack array[stack.top--];
	}

	void move_disk(Stack s, Stack d, char s, char d)
	{
		int pole1=pop(beg);
		int pole2=pop(end);
	}
	
	//when pole1 is empty
	if(pole1==Integer.MIN_VAl)
	{
		push(beg,pole2);
		move_disk(d,s,pole2)

	}
	else 
		//when pole2 is empty
        if(pole2==Integer.MIN_VAl)
		{ 
			push(end,pole1);
			move_disk(s,d,pole1);

	    }
	else
		//pole1>pole2
		if(pole1>pole2)
		{
			push(beg,pole1);
			push(beg,pole2);
			move_disk(d,s,pole2);

		}
		else
			//pole1<pole2
		{
			push(end,pole2);
			push(end,pole1);
			move_disk(s,d,pole1);


		}

		void move_disk(char fromPeg, char toPeg, int disk)
		{
			System.out.println("move disk"+disk+"from"+fromPeg"to"+toPeg);
		}

	public static void main(String[] args)
	{
		int num_of_disk=3;
		Hanoi obj=new Hanoi();
		Stack beg,aux,end;
		//create stack to hold disk
		beg=obj.createStack(num_of_disk);
		aux=obj.craeteStack(num_of_disk);
		end=obj.createStack(num_of_disk);

		obj.towerHanoi(num_of_disk,beg,aux,end);

	}

	public towerHanoi(int n,Stack start, Stack auxil, Stack finish)
	{
		int tot_n_moves;
		char s='S',a='A',f='F';

		//interchange even number of poles
		if(num_of_disk%2==0)
		{
			char temp=d;
			d=a;
			a=temp;
		}
		tot_n_moves=(int) (math.pow(2,num_of_disk)-1);

		//

	}
}