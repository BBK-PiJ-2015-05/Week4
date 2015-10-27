/*
* Week 4 Day 8
* PiJ 2015 - Sarah Connor & Chris Grocott
* Exercise 1 Supermarket queue
* Linked List of objects Person
* Implements the PersonQueue
*/

public class LinkedListPersonQueue implements PersonQueue{
	
	//Person at the front of the queue
	private Person head;
	
	//constructor
	public LinkedListPersonQueue(){
		this.head = null;
	}
	
	//inserts a Person at the end of the queue
	public void insert (Person person){
		if (this.head == null){
			this.head = person;
		}else{
			head.addPerson(person);
		}
	}
	
	//removes a Person from the front of the queue
	public Person retrieve(){
		Person served = head;
		head = served.getNextPerson();
		return served;
	}
	
	//returns concatenated string of all Persons
	//uses Person.toString()
	public String toString() {
		return this.head.toString();
	}
}