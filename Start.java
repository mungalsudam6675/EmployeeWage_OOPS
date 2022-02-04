package EmpWage_OOPS;

import Com.OOPS.Utility.Utility;

	
public class Start {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HRS = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_NUM_OF_HRS = 100;
	
	public static int calculateWage() {
		
		int empHrs = 0;
		int totalEmpWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		
		while( totalEmpHrs < MAX_NUM_OF_HRS && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
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
		
		totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HRS;
		
		System.out.println("Total month Employee wage is " +totalEmpWage);
		return totalEmpWage;	
	
	}

	public static void main(String[] args) {
		
		calculateWage();
		
		
	}

}
