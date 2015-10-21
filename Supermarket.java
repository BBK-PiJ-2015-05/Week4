/*
* Week 4 Day 8
* PiJ 2015 - Sarah Connor & Chris Grocott
* Exercise 1 Supermarket queue
* tests PersonQueues on object Supermarket*/

public class Supermarket{
	private PersonQueue queue;
	
	public static void main(String[] args){
		Supermarket aldi = new Supermarket(new LinkedListPersonQueue());
		aldi.test();
	}
	
	//constructor
	public Supermarket(PersonQueue newQueue) {
		this.queue = newQueue;
	}
	
	//adds a person to the end of the queue
	public void addPerson(Person person){
		queue.insert(person);
	}
	
	//removes a person from the front of the queue
	public void servePerson(){
		queue.retrieve();
	}
	
	//uses Person.toString
	public String toString() {
		return this.queue.toString();
	}
	
	//hard-coded test of PersonQueue methods
	public void test(){
		this.addPerson(new Person("Michael"));
		this.addPerson(new Person("Jane"));
		this.addPerson(new Person("Alice"));
		this.addPerson(new Person("Bob"));
		
		System.out.println(this.toString());
		
		this.servePerson();
		this.servePerson();
		this.servePerson();
		
		System.out.println(this.toString());
	}
	
}