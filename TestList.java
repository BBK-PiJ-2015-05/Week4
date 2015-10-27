/*
* Week 4 Day 1
* Exercise 9. From Array to list
* Sarah Connor
*/

public class TestList{
	public static void main(String[] args){
		// int[] myArray = {12,1,9,3,6,5,10,2,8,7,4,11};
		// ListUtilities myList = new ListUtilities();
		// myList = myList.arrayToList(myArray);
		// myList = myList.quicksort();
		// System.out.println(myList.prettyPrint());


		//Maps
		System.out.println ("Give me a string and I will calculate its hash code");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
		MyMap myHashTable = new MyMap();
		myHashTable.put(smallHash, str);
		System.out.println(myHashTable.get(smallHash));
		myHashTable.remove(smallHash);
		System.out.println("If I try to get my removed String it is: " + myHashTable.get(smallHash));
		System.out.println("If I check if the table is now empty I get: " + myHashTable.isEmpty());

		System.out.println ("Give me a string and I will calculate its hash code");
		String first = System.console().readLine();
		hash = first.hashCode();
		smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
		myHashTable.put(smallHash, first);

		System.out.println ("Give me a string and I will calculate its hash code");
		String sec = System.console().readLine();
		hash = sec.hashCode();
		smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
		myHashTable.put(smallHash, sec);

		System.out.println(myHashTable.get(smallHash));

	}
}