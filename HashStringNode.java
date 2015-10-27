/*
* Week 4 Day 2
* Exercise 5. Maps
* Sarah Connor
*/

public class HashStringNode{

	private String name;
	HashStringNode nextName;

	//constructor
	public HashStringNode(String name){
		this.name = name;
		this.nextName = null;
	}

	//getters
	public String getName(){
		return this.name;
	}

	public HashStringNode getNext(){
		return this.nextName;
	}

	public HashStringNode getLast(){
		if(this.nextName != null){
			this.nextName.getLast();
		}
		return this;
	}

	//setters
	public void setName(String name){
		this.name = name;
	}

	public void setNext(HashStringNode next){
		if(this.nextName != null){
			this.nextName.setNext(next);
		}
		this.nextName = next;
	}
}