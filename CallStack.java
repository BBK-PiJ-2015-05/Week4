/*
* Week 4 Day 1
* Exercise 8. Stacks
* Sarah Connor
*/

public class CallStack{

	private StackNode node;

	//constructor
	public CallStack(){
		this.node = null;
	}

	public void push(int num){
		System.out.println("Pushing... " + num);
		StackNode newNode = new StackNode(num);
		if(this.node == null){
			this.node = newNode;
		}else{
			this.node.addNode(num);
		}

	}

	public void pop(){
		System.out.print("Popping... ");
		if(this.node == null){
			//do nothing
		}else if(this.node.getNext() == null){
			System.out.println("it's a " + this.node.getInt());
			this.node = null;
		}else{
			this.node.removeNode();
		}
	}

	public boolean empty(){
		if(this.node == null){
			System.out.println("Stack is empty.");
			return true;
		}else{
			System.out.println("The stack is not empty.");
			return false;
		}
	}
}