package EmpWage_OOPS;

import Com.OOPS.Utility.Utility;

public class Start {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_WAGE_PER_HRS = 20;
	public static final int NUM_OF_WORKING_DAYS = 2;

	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		
		for(int day=1; day<=NUM_OF_WORKING_DAYS; day++) {
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
			empWage = empHrs * EMP_WAGE_PER_HRS;

			totalEmpWage += empWage;
		
		}
		
		System.out.println("Total month Employee wage is " +totalEmpWage);
		
	}

}
