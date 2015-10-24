/*
* Week 4 Day 1
* Exercise 8. Stacks
* Sarah Connor
*/

public class StackNode{

	private int num;
	private StackNode nextNode;

	//constrcutors
	public StackNode(){
		this.num = 0;
		this.nextNode = null;
	}

	public StackNode(int num){
		this.num = num;
		this.nextNode = nextNode;
	}

	//getters
	public int getInt(){
		return this.num;
	}

	public StackNode getNext(){
		return this.nextNode;
	}

	//setters
	public void setInt(int num){
		this.num = num;
	}

	public void setNext(StackNode next){
		this.nextNode = next;
	}

	public void addNode(int num){
		if(this.nextNode == null){
			StackNode newNode = new StackNode(num);
			this.nextNode = newNode;
		}else{
			this.nextNode.addNode(num);
		}
	}

	public void removeNode(){
		if(this.nextNode.nextNode == null){
			System.out.println("it's a " + this.nextNode.getInt());
			this.nextNode = null;
		}else{
			this.nextNode.removeNode();
		}
	}
}