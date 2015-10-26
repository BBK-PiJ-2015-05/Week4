/*
* Week 4 Day 2
* Exercise 5. Maps
* implements the SimpleMap interface
* creates a one-to-many hash table
* Sarah Connor
*/

public class MyHashTable implements SimpleMap{
	private HashUtilities[] keys;

	//constructors
	public MyMap(){
		this.keys = new HashUtilities[1000];
		for(int i = 0; i < 1000; i++){
			this.keys[i] = new HashUtilities(-1, null);
		}
	}
	
	/**
	* Puts a new String in the map.
	*
	* If the key is already in the map, nothing is done.
	*/
	public void put(int key, String name){
		HashStringNode newName = new HashStringNode(name);
		if(keys[key - 1].getKey() == -1){
			try{
				key[key - 1].getNodeName
			}catch(NullPointerException e){
				keys[key - 1 ].setKey(key);
				keys[key - 1].setNodeName(newName);
			}
			
			
		}
	}


	/**
	* Returns the name associated with that key,
	* or null if there is none.
	*/
	public String get(int key){
		if(keys[key - 1].getKey() != -1){
			return keys[key - 1].getNodeName().getName();
		}else{
			return "empty";
		}
	}

	/**
	* Removes a name from the map. Future calls to get(key)
	* will return null for this key unless another
	* name is added with the same key.
	*/
	public void remove(int key){
		if(keys[key - 1].getKey() != -1){
			keys[key - 1].setNodeName(null);
			keys[key -1 ].setKey(-1);
		}
	}


	/**
	* Returns true if there are no workers in the map,
	* false otherwise
	*/
	public boolean isEmpty(){
		for(int i = 0; i < 1000; i++){
			if(keys[i].getKey() != -1){
				return false;
			}
		}
		return true;
	}

}