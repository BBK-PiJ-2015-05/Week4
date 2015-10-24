/*
* Week 4 Day 1
* Exercise 9. From Array to list
* Sarah Connor
*/

public class ListUtilities{
	private int num;
	private ListUtilities nextNum;

	//constrcutors
	public ListUtilities(){
		this.num = 0;
		this.nextNum = null;
	}

	public ListUtilities(int num){
		this.num = num;
		this.nextNum = nextNum;
	}

	//getters
	public int getInt(){
		return this.num;
	}

	public ListUtilities getNext(){
		return this.nextNum;
	}

	//setters
	public void setInt(int num){
		this.num = num;
	}
	
	public void setNext(ListUtilities next){
		this.nextNum = next;
	}

	public void addNum(int num){
		if(this.nextNum == null){
			ListUtilities newNode = new ListUtilities(num);
			this.nextNum = newNode;
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
				startNode.addNum(array[i]);
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
}