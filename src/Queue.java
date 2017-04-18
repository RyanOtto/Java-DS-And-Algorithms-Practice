
public class Queue {
		private LinkedList list;
		
		public Queue()
		{
			list = new LinkedList();
		}

		public boolean isEmpty()
		{
			return(list.getSize()==0);
		}

		public void enqueue(int value) //Add node to back
		{
			list.add(value);
		}

		public Node dequeue() //Remove front Node
		{
			Node node = list.get(0);
			list.delete(0);
			return node;
		}

		public Node peek() //Return front Node
		{
			return list.get(0);
		}
}
