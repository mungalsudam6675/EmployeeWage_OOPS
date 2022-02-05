package EmpWage_OOPS;

import Com.OOPS.Utility.Utility;

	
public class Start {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	public static int calculateEmpWage(String company,int empWagePerHr, int numOfWorkingDays,int maxNumOfHrs) {
		
		int empHrs = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		
		while( totalEmpHrs < maxNumOfHrs && totalWorkingDays < numOfWorkingDays ) {
			totalWorkingDays++;
			int check=Utility.empCheck();
			switch(check) {
				case IS_FULL_TIME : {
					empHrs = 8;
					break;
				}
			
				case  IS_PART_TIME :{
					empHrs = 4;
					break;
				}
			
				default : {
					 empHrs = 0;
				}
				
				
			}
			
			totalEmpHrs += empHrs;
		
		}
		
		totalEmpWage = totalEmpHrs * empWagePerHr;
		
		System.out.println("Total month Employee wage is " +totalEmpWage);
		return totalEmpWage;	
	
	}

	public static void main(String[] args) {
		
		calculateEmpWage("Dmart",20,2,10);
		calculateEmpWage("Reliance",20,2,10);
		
		
	}

}
