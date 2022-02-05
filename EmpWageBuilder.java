package EmpWage_OOPS;

import Com.OOPS.Utility.Utility;

	
public class EmpWageBuilder {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	private final String company;
	private final int empWagePerHr;
	private final int numOfWorkingDays;
	private final int maxNumOfHrs;
	private int totalEmpWage;
	
	public EmpWageBuilder(String company,int empWagePerHr, int numOfWorkingDays,int maxNumOfHrs) {
		this.company=company;
		this.empWagePerHr=empWagePerHr;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxNumOfHrs=maxNumOfHrs;
	}
	
	public int calculateEmpWage() {
		
		int empHrs = 0;
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
			System.out.println("Day#: " + totalWorkingDays + "Emp hrs: " +empHrs);
		
		}
		
		return totalEmpWage = totalEmpHrs * empWagePerHr;
	
	}
	
	@Override
	public String  toString() {
		return "Total Empwage for company : " + company + " is : " + totalEmpWage; 
	}

	public static void main(String[] args) {
		
		EmpWageBuilder dmart = new EmpWageBuilder("Dmart",20,2,10);
		EmpWageBuilder reliance = new EmpWageBuilder("Reliance",40,5,20);
	    dmart.calculateEmpWage();
	    System.out.println(dmart);
	    reliance.calculateEmpWage();
	    System.out.println(reliance);
		
	}

}
