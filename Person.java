public class Person{
	private String name;
	Person nextPerson;
	
	//constructor
	public Person(){
		this.name = null;
		this.nextPerson = null;
	}
	
	public Person(String name){
		this.name = name;
		this.nextPerson = null;
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void
	setNextPerson(Person nextPerson){
		this.nextPerson = nextPerson;
	}
	
	//getters
	public String getName(){
		return this.name;
	}
	
	public Person getNextPerson(){
		return this.nextPerson;
	}
	
	//adds a person to the linked list
	public void addPerson(Person newPerson){
		if(this.nextPerson == null){
				this.nextPerson = newPerson;
		}else{
			this.nextPerson.addPerson(newPerson);
		}
	}
	
	public String toString() {
		String myName = this.getName() + "\n";
		if(this.getNextPerson() == null) {
			return myName;
		}
		else {
			return myName + this.getNextPerson().toString();
		}
	}
	
	
}