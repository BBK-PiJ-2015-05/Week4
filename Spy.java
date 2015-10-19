/*
* Week 4 Day 7
* 1. Instance Counter
* Sarah Connor
*/


public class Spy{
	private static int spyCount = 0;
	private int spyID;
	
	public Spy(int id){
		spyCount++;
		this.spyID = id;
		System.out.println("Current spy: " + id);
		System.out.println("Total spies: " + spyCount);
	}
	
	public void die(int exSpy){
		spyCount--;
		System.out.println("Spy " + exSpy + " has been detected and eliminated.");
		if (spyCount > 1){
			System.out.println("Only " + spyCount + " spies remaining.");
		}else{
			System.out.println("Only " + spyCount + " spy remaining.");
		}
	}
	public static void main(String[] args){
	Spy bob = new Spy(1);
	Spy joe = new Spy(2);
	joe.die(2);
	}
}
