public class HashMap {
	private final int TABLE_SIZE;
	HashEntry[] table;

	HashMap(int TABLE_SIZE) {
		this.TABLE_SIZE=TABLE_SIZE;
		table = new HashEntry[TABLE_SIZE];
		for(int i = 0; i < TABLE_SIZE; i++) table[i] = null;
	}

	public int get(int key) {
		int hash = (key % TABLE_SIZE);
		while(table[hash]!=null && table[hash].getKey()!=key) hash=(hash+1) % TABLE_SIZE;
		if (table[hash] == null) return -1;
		else return( table[hash].getValue() );
	}

	public void put(int key, int value) {
		if(isFull()) return;
		int hash = (key % TABLE_SIZE); 
		while (table[hash] != null) hash = (hash + 1) % TABLE_SIZE; //In case of collision, keep trying next entry
		table[hash] = new HashEntry(hash, value);
	}
	
	public Boolean isFull(){
		for(int i=0; i<TABLE_SIZE; i++){
			if(table[i]==null) return false;
		}
		return true;
	}
}