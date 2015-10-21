public class Supermarket{
	private PersonQueue queue;
	
	public static void main(String[] args){
		Supermarket aldi = new Supermarket(new LinkedListPersonQueue());
		aldi.test();
		
	}
	
	public Supermarket(PersonQueue newQueue) {
		this.queue = newQueue;
	}
	
	public void addPerson(Person person){
		queue.insert(person);
	}
	
	public void servePerson(){
		queue.retrieve();
	}
	
	public String toString() {
		return this.queue.toString();
	}
	
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