/*
* Week 4 Day 1
* Exercise 9. From Array to list
* Sarah Connor
*/

public class TestList{
	public static void main(String[] args){
		int[] myArray = {1,2,3,4,5,10,9,8,7};
		ListUtilities myList = new ListUtilities();
		myList = myList.arrayToList(myArray);
		myList.bubbleSort();
		myList = myList.returnToStart();
		System.out.println(myList.prettyPrint());
	}
}