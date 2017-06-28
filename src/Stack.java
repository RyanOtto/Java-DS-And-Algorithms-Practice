public class Stack {
	private LinkedList list;
	
	public Stack()
	{
		list = new LinkedList();
	}

	public boolean isEmpty()
	{
		return (list.getSize()==0);
	}

	public void push(int value)
	{
		list.add(0,value);
	}

	public Node pop()
	{
		Node node = list.get(0);
		list.delete(0);
		return node;
	}

	public Node peek()
	{
		return list.get(0);
	}
}