/*
* Week 4 Day 7
* 3. Singly-linked lists
* Sarah Connor
*/

public class HospitalManager{
	private Patient patientListStart;
	
	public HospitalManager(){
		this.patientListStart = null;
	}
	
	public Patient getStart(){
		return patientListStart;
	}
	
	public static void main(String[] args){
		HospitalManager hm = new HospitalManager();
		hm.launch();
		
		
	}
	
	public void launch(){
		//populating the list
		Patient firstPatient = new Patient("Luke", 76, "TB");
		Patient patientListStart = this.getStart();
		patientListStart = firstPatient;
		Patient secondPatient = new Patient("Yolanda", 34, "Meningitis");
		patientListStart.addPatient(secondPatient);
		Patient thirdPatient = new Patient("Bob", 89, "Liver Failure");
		patientListStart.addPatient(thirdPatient);
		Patient fourthPatient = new Patient("Kevin", 2, "Jaundice");
		patientListStart.addPatient(fourthPatient);
		Patient fifthPatient = new Patient("Bubba", 54, "Heart Failure");
		patientListStart.addPatient(fifthPatient);
		Patient sixthPatient = new Patient("Mike", 20, "Rabies");
		patientListStart.addPatient(sixthPatient);
		Patient seventhPatient = new Patient("Julian", 48, "Pneumonia");
		patientListStart.addPatient(seventhPatient);
		Patient eighthPatient = new Patient("Cletus", 12, "Chicken Pox");
		patientListStart.addPatient(eighthPatient);
		Patient ninthPatient = new Patient("Jimmy", 56, "Japanese Encephalitis");
		patientListStart.addPatient(ninthPatient);
		Patient tenthPatient = new Patient("Helga", 18, "Flu");
		patientListStart.addPatient(tenthPatient);
		
		//messing with the list
		patientListStart.printPatientList();
		System.out.println("\nDeleting patients from linked list...\n");
		System.out.println(patientListStart.deletePatient(firstPatient));
		patientListStart = secondPatient;
		patientListStart.deletePatient(fourthPatient);
		patientListStart.deletePatient(ninthPatient);
		patientListStart.printPatientList();
		
	}
}