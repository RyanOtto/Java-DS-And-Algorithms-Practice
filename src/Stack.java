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
		list.add(value);
	}

	public Node pop()
	{
		Node node = list.get(list.getSize()-1);
		list.delete(list.getSize()-1);
		return node;
	}

	public Node peek()
	{
		return list.get(list.getSize()-1);
	}
}

