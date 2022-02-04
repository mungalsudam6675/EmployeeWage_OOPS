package EmpWage_OOPS;

import Com.OOPS.Utility.Utility;

public class Start {
	
	public static final int IS_FULL_TIME = 1;
	public static final int EMP_WAGE_PER_HRS = 20;

	public static void main(String[] args) {
		int check=Utility.empCheck();	
		if(check == IS_FULL_TIME) {
			int empHrs=8;
			int empWage = empHrs * EMP_WAGE_PER_HRS; 
			System.out.println("Employee Wage = " + empWage);
		}
		else {
			System.out.println("Employee is Absent");
		}

	}

}
