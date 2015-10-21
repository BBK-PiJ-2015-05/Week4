public class Queue{
	
	private LinkedInt element;

	//constructor
	public Queue(){
		this.element = null;
	}

	public void insert(int b){
		LinkedInt newInt = new LinkedInt(b);
		if (this.element == null){
			this.element = newInt;
		}else{
			this.element.addInt(newInt);
		}
	}

	public void retrieve(){
		if (this.element == null){
			//do nothing
		}else{
			this.element = this.element.getNextInt();
		}
	}

	public int size(){
		if(this.element != null){
			return this.element.getSize();
		}else{
			return 0;
		}
	}
	
	public void printQueue(){
		if (this.element == null){
			System.out.println("Queue is empty.");
		}else{
			System.out.println(this.element.printLinkedInt());
		}
	}
	
	//main
	public static void main(String[] args){
		Queue test = new Queue();
		System.out.println("There are " + test.size() + " requests in the queue.");
		System.out.println("Inserting request 5...");
		test.insert(5);
		System.out.println("Inserting request 8...");
		test.insert(8);
		System.out.println("Inserting request 12...");
		test.insert(12);
		System.out.println("There are " + test.size() + " requests in the queue.");
		System.out.print("Retrieving request 5");
		test.retrieve();
		System.out.println("... done.");
		System.out.println("Inserting request 13...");
		test.insert(13);
		System.out.println("There are " + test.size() + " requests in the queue.");
		System.out.print("Retrieving request 8");
		test.retrieve();
		System.out.println("... done.");
		System.out.print("Retrieving request 12");
		test.retrieve();
		System.out.println("... done.");
		System.out.println("There are " + test.size() + " requests in the queue.");
		System.out.print("Retrieving request 13");
		test.retrieve();
		System.out.println("... done.");
		System.out.println("There are " + test.size() + " requests in the queue.");
		
	}
	
	//class LinkedInt
	public class LinkedInt{
		private int num;
		private LinkedInt nextInt;
		
		//constructor
		public LinkedInt(int num){
			this.num = num;
			this.nextInt = null;
		}
		
		public void addInt(LinkedInt newInt){
			if(this.nextInt == null){
				this.nextInt = newInt;
			}else{
				this.nextInt.addInt(newInt);
			}
		}
		
		public int getInt(){
			return this.num;
		}
		
		public LinkedInt getNextInt(){
			return this.nextInt;
		}
		
		public int getSize(){
			if(this.nextInt == null){
				return 1;
			}else{
				return 1 + this.nextInt.getSize();
			}
		}
		
		public String printLinkedInt(){
			String myQueue = Integer.toString(this.num);
			if (this.nextInt == null){
				return myQueue;
			}else {
				return myQueue += ", " + this.nextInt.printLinkedInt();
			}
			
		}
	}
}