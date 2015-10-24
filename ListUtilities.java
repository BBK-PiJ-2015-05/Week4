/*
* Week 4 Day 1
* Exercise 9. From Array to list
* Sarah Connor
*/

public class ListUtilities{
	private int num;
	private ListUtilities nextNum;
	private ListUtilities prevNum;

	//constrcutors
	public ListUtilities(){
		this.num = 0;
		this.nextNum = null;
		this.prevNum = null;
	}

	public ListUtilities(int num){
		this.num = num;
		this.nextNum = null;
		this.prevNum = null;

	}

	//getters
	public int getInt(){
		return this.num;
	}

	public ListUtilities getNext(){
		return this.nextNum;
	}

	public ListUtilities getPrev(){
		return this.prevNum;
	}

	//setters
	public void setInt(int num){
		this.num = num;
	}
	
	public void setNext(ListUtilities next){
		this.nextNum = next;
	}

	public void setPrev(ListUtilities prev){
		this.prevNum = prev;
	}

	public void addNum(int num){
		if(this == null){
			ListUtilities newNode = new ListUtilities(num);
		}else if(this.nextNum == null){
			ListUtilities newNode = new ListUtilities(num);
			this.nextNum = newNode;
			newNode.prevNum = this;
		}else{
			this.nextNum.addNum(num);
		}
	}
	
	//static method that converts integer arrays to a linked list
	public static ListUtilities arrayToList(int[] array){
		ListUtilities startNode = new ListUtilities();
		if (array.length != 0){
			startNode.setInt(array[0]);
			for (int i = 1; i < array.length; i++){
				startNode.addNumSorted(array[i]);
			}
		}
		return startNode;
	}

	//returns a string of all ints in the Linked list concatenated
	public String prettyPrint (){
		String nums = this.getInt() + "\n";
		if(this.getNext() == null) {
			return nums;
		}
		else {
			return nums + this.getNext().prettyPrint();
		}
	}

	//adds integers in ascending order
	public void  addNumSorted(int a){
		System.out.println("Testing... " + a);
		if(this.prevNum != null){
			ListUtilities temp = new ListUtilities();
			System.out.println("Reversing " + a);
			temp = this.prevNum;
			System.out.println("Returned to " + temp.num);
			temp.addNumSorted(a);
			
		}
		if(this.prevNum == null && this.num > a){
			//if at the beginning, and lowest number, insert at beginning
			System.out.println("Adding to beginning... " + a);
			ListUtilities newNode = new ListUtilities(a);
			newNode.nextNum = this;
			this.prevNum = newNode;
			System.out.println(this.num + " is now attached to " + this.prevNum.num);
			return;
		}else if(this.nextNum == null && this.num < a){
			//if at the end and highest number insert at the end
			System.out.println("Adding to the end... " + a);
			ListUtilities newNode = new ListUtilities(a);
			this.nextNum = newNode;
			newNode.prevNum = this;
			return;
		}else if (this.num < a && this.nextNum.num > a){
			//insert in between lower and higher numbers
			System.out.println("Inserting " + a + " in between " + this.num + " and " + this.nextNum.num);
			ListUtilities newNode = new ListUtilities(a);
			newNode.nextNum = this.nextNum;
			this.nextNum.prevNum = newNode;
			this.nextNum = newNode;
			newNode.prevNum = this;
			return;
		}
	}

	//method to return to the beginning of a list
	public ListUtilities returnToStart(){
		ListUtilities temp = new ListUtilities();
		if(this.prevNum != null){
			temp = this.prevNum.returnToStart();
			return temp;
		}else{
			System.out.println("Returned to... " + this.num);
			return this;
		}
	}
		

	//Sorts a linked list with a bubble sort
	public ListUtilities bubbleSort(){
		ListUtilities temp = new ListUtilities();
		if(this.num > this.nextNum.num){
			temp = this;
			this.nextNum = this.nextNum.nextNum;
			temp.nextNum = this;
		}
		return temp;
	}
}