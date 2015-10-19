/*
* Week 4 Day 7
* 3. Singly-linked lists
* Sarah Connor
*/

public class Patient{
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient = null;
	private Patient prevPatient = null;
	private static  int patientCount = 1;
	
	Patient(String name, int age, String illness){
		this.name= name;
		this.age = age;
		this.illness = illness;
	}
	
	public void addPatient(Patient newPatient){
		if(this.nextPatient == null){
				this.nextPatient = newPatient;
				newPatient.prevPatient = this;
				patientCount++;
		}else{
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public boolean deletePatient(Patient patient){
		if(this.nextPatient == null){
			return false;
		}else if(this.prevPatient == null && this.name.equals(patient.name)){
			//still have to delete first patient from elsewhere but keeps patient count true
			patientCount--;
			return true;
		}else if(this.nextPatient.name.equals(patient.name)){
			nextPatient.nextPatient.prevPatient = this;
			this.nextPatient = nextPatient.nextPatient;
			patientCount--;
			return true;
		}else{
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	//print forwards through the list
	public void printPatientList(){
		if (this.nextPatient != null) {
			System.out.println(this.name + ", " + this.age + ", " + this.illness);
			this.nextPatient.printPatientList();
		}else{
			System.out.println(this.name + ", " + this.age + ", " + this.illness);
			System.out.println("Total number of patients: " + this.patientCount);
		}
	}
	
	//print backwards through the list
	public void printBackwards(){
		if (this.prevPatient != null) {
			System.out.println(this.name + ", " + this.age + ", " + this.illness);
			this.prevPatient.printBackwards();
		}else{
			System.out.println(this.name + ", " + this.age + ", " + this.illness);
			System.out.println("Total number of patients: " + this.patientCount);
		}
	}
}