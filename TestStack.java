/*
* Week 4 Day 1
* Exercise 8. Stacks
* Sarah Connor
*/

public class TestStack{

	public static void main(String[] args){
		CallStack test = new CallStack();
		test.empty();
		test.push(1);
		test.push(2);
		test.push(3);
		test.empty();
		test.pop();
		test.pop();
		test.pop();
		test.empty();

	}
}