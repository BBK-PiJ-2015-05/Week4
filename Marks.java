/*
* Week 4 Day 7
* 2. do {practice} while (!understood);
* Sarah Connor
*/
public class Marks{
		private int totalMarks;
		private int distinction;
		private int passes;
		private int fails;
		private int invalid;
		
		public Marks(int totalMarks, int distinction, int passes, int fails, int invalid){
			this.totalMarks = totalMarks;
			this.distinction = distinction;
			this.passes = passes;
			this.fails = fails;
			this.invalid = invalid;
		}
		public void checkMark(int mark){
			
			if (mark >= 70 && mark < 100){
				distinction++;
				totalMarks++;
			}else if(mark > 50 && mark < 70){
				passes++;
				totalMarks++;
			}else if(mark >= 0 && mark < 50){
				fails++;
				totalMarks++;
			}else if (mark == -1){
				//do nothing
			}else{
				invalid++;
			}
		}
	
	
	
	public static void main(String[] args){
		int mark = 0;
		Marks total = new Marks(0, 0, 0, 0, 0); 
		do{
			System.out.print("Input a mark: ");
			String response = System.console().readLine();
			mark = Integer.parseInt(response);
			total.checkMark(mark);
		}while(mark != -1);
		
		System.out.println("The total number of students is: " + total.totalMarks);
		System.out.println(total.distinction + " passed with distinction, " + total.passes + " passed and ");
		System.out.println(total.fails + " failed. " + total.invalid + " were invalid submissions.");
	}
	
}