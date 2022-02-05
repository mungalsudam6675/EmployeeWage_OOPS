package EmpWage_OOPS;

import Com.OOPS.Utility.Utility;
	
public class EmpWageBuilderArray {
	
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage [] companyEmpWageArray;
	
	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company,int empWagePerHr, int numOfWorkingDays,int maxNumOfHrs ) {
		
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empWagePerHr, numOfWorkingDays, maxNumOfHrs);
		
		numOfCompany++;
	}
	
	private void computeEmpWage() {
		for(int i=0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	
	
	
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
		int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		while( totalEmpHrs < companyEmpWage.maxNumOfHrs && totalWorkingDays < companyEmpWage.numOfWorkingDays ) {
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
		
		return totalEmpHrs = totalEmpHrs * companyEmpWage.empWagePerHr;
	
	}
	
	

	public static void main(String[] args) {
		
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray ( ); 
		empWageBuilder.addCompanyEmpWage("DMart", 40, 4, 20); 
		empWageBuilder.addCompanyEmpWage ("Reliance", 10, 4, 20); 
		empWageBuilder.computeEmpWage();
		
	}

}
