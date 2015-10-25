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
				startNode.addNum(array[i]);
			}
		}
		return startNode;
	}

	//static method that converts integer arrays to a sorted linked list
	public static ListUtilities arrayToSortedList(int[] array){
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
		}else {
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
			//System.out.println("Returned to... " + this.num);
			return this;
		}
	}

	//method to go to the end of a list
	public ListUtilities goToEnd(){
		ListUtilities temp = new ListUtilities();
		if(this.nextNum != null){
			temp = this.nextNum.goToEnd();
			return temp;
		}else{
			//System.out.println("Returned to... " + this.num);
			return this;
		}
	}

	//measures the size of a list
	public int size(){
		ListUtilities start = this.returnToStart();
		int count = 1;
		while(start.nextNum != null){
			count++;
			start = start.nextNum;
		}
		return count;
	}

	//swap a linked node forward in the list
	public void swapF(ListUtilities temp){
		//if not first, make c prev be a
		if(this.prevNum != null){
			//make a point to c
			this.prevNum.nextNum = temp;
			//make c prev be a
			temp.prevNum = this.prevNum;
		}else{
			//else make it point at nothing
			temp.prevNum = null;
		}
		//if c is not last
		if(temp.nextNum != null){
			//make b next be d
			this.nextNum = temp.nextNum;
			//make d prev be b
			this.nextNum.prevNum = this;
		}else{
			//else have b point at nothing
			this.nextNum = null;
		}
		
		//make b prev be c
		this.prevNum = temp;
		//make c next be b
		temp.nextNum = this;
	}

	//swap a linked node backward in the list
	public void swapB(ListUtilities temp){
		//make temp point to b
		temp = this.prevNum;
		
		//if b is not first, make 
		if(temp.prevNum != null){
			//make a next be c
			temp.prevNum.nextNum = this;
			//make c prev be a
			this.prevNum = temp.prevNum;
		}else{
			//else make it point at nothing
			this.prevNum = null;
		}
		//if c is not last
		if(this.nextNum != null){
			//make b next be d
			temp.nextNum = this.nextNum;
			//make d prev be b
			this.nextNum.prevNum = temp;
		}else{
			//else have 1 point at nothing
			this.nextNum = null;
		}
		
		//make 1 prev be 2
		this.nextNum = temp;
		//make 2 next be 1
		temp.prevNum = this;
	}
	
		

	//Sorts a linked list with a bubble sort
	public ListUtilities bubbleSort(){
		boolean swaps = true;		
		
		while(swaps == true){
			//no swaps to begin with
			swaps = false;

			//if not end of list
			if (this.nextNum != null){
				ListUtilities temp = new ListUtilities();
				//make temp point to 2
				temp = this.nextNum;
				//if 1 is greater than 2
				if(this.num > this.nextNum.num){
					//it swapped
					swaps = true;
					swapF(temp);
				}

			//keep going until you hit end of list
			temp.bubbleSort();
			} 

			//if at end of list and swaps were made, return to beginning and try again
			if (this.nextNum == null && swaps == true){

				this.returnToStart().bubbleSort();
			}
		}
	//return beginning of list
	return this.returnToStart();
	}

	//sorts a linked list with a cocktail sort
	public ListUtilities cocktailSort(){
		boolean swaps = true;
		ListUtilities temp = new ListUtilities();
		
		while(swaps == true){
			//no swaps to begin with
			swaps = false;

			//if not end of list
			if (this.nextNum != null){
				
				//make temp point to next
				temp = this.nextNum;

				//if b is greater than c
				if(this.num > this.nextNum.num){
					//it swapped
					swaps = true;
					
					swapF(temp);
				}
			//keep going until you hit end of list
			temp.cocktailSort();
			}
			//if not beginning of list
			if (this.prevNum != null){
				//if c is smaller than b
				if(this.num < this.prevNum.num){
					//it swapped
					swaps = true;
					swapB(temp);
				}
				//keep going until hit beginning of list
				temp.cocktailSort();
			}
		}
	//return beginning of list
	return this.returnToStart();
	}

	//quicksort calls on partition recursively
	public ListUtilities quicksort(){
		
		ListUtilities lo = this.returnToStart();
		ListUtilities hi = this.goToEnd();
		ListUtilities sorted = this.partition(lo, hi);
		
		return sorted.returnToStart();		
	}
	//recursive call for quicksort
	public ListUtilities partition(ListUtilities start, ListUtilities pivot){
		boolean swap = false;
		ListUtilities lo = start;
		ListUtilities hi = pivot;
		while( lo != pivot){
			//System.out.println("lo " + lo.num + " hi " + hi.num + " pivot " + pivot.num + " start " + start.num);
			if(lo.num > pivot.num){
				ListUtilities next = lo.nextNum;
				if(lo == start){
					start = next;
				}
				//if lo is not first
				if(lo.prevNum != null){
					//remove current lo
					lo.prevNum.nextNum = lo.nextNum;
					next.prevNum = lo.prevNum;
				}else{
					next.prevNum = null;
				}
				//if hi is not last
				if(hi.nextNum != null){
					//connect with element after current hi
					lo.nextNum = hi.nextNum;
					hi.nextNum.prevNum = lo;
				}else{
					//connect with element after current hi
					lo.nextNum = null;
				}
				//connect with pivot
				lo.prevNum = hi;
				hi.nextNum = lo;

				hi = lo;
				lo = next;
			}else{
				lo = lo.nextNum;
			}
		}
		if(start != pivot.prevNum && start != pivot){
			start = partition(start, pivot.prevNum);
		}
		if(pivot != hi){
			partition(pivot.nextNum, hi);
		}
		return start;
	}		
}