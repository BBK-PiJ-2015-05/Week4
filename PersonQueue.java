/*
* Week 4 Day 8
* PiJ 2015
* Exercise 1 Supermarket queue
* Base Interface provided
*/


public interface PersonQueue{
/*
* Adds another person to the queue
*/
void insert(Person person);

/*
* Removes a person from the queue
*/
Person retrieve();
}