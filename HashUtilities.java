/*
* Week 4 Day 2
* Exercise 5. Maps
* Sarah Connor
*/

public class HashUtilities{

	private int key;
	private HashStringNode name;

	//constructor
	public HashUtilities(){
		this.key = -1;
		this.name = null;
	}

	public HashUtilities(int key, String name){
		this.key = key;
		HashStringNode newName = new HashStringNode(name);
		this.name = newName;
	}

	//getters
	public int getKey(){
		return this.key;
	}

	public HashStringNode getNodeName(){
		if(this.name != null){
			return this.name;	
		}else{
			return null;
		}
	}

	//setters
	public void setKey(int hash){
		this.key = hash;
	}
	public void setNodeName(HashStringNode name){
		this.name = name;
	}

	//returns a hash code less than 1,000
	public static int shortHash(int a){
		int hash = Math.abs(a) % 1000;
		return hash;
	}
}