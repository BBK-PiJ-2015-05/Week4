/*
* Week 4 Day 1
* Exercise 9. From Array to list
* Sarah Connor
*/

public class TestList{
	public static void main(String[] args){
		int[] myArray = {12,1,9,3,6,5,10,2,8,7,4,11};
		ListUtilities myList = new ListUtilities();
		myList = myList.arrayToList(myArray);
		myList = myList.quicksort();
		System.out.println(myList.prettyPrint());

	}
}