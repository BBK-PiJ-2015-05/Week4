public class LinkedListPersonQueue implements PersonQueue{
	
	private Person head;
	
	//constructor
	public LinkedListPersonQueue(){
		this.head = null;
	}
	
	public void insert (Person person){
		if (this.head == null){
			this.head = person;
		}else{
			head.addPerson(person);
		}
		
	}
	
	public Person retrieve(){
		Person served = head;
		head = served.getNextPerson();
		return served;
	}
	
	public String toString() {
		return this.head.toString();
	}
}