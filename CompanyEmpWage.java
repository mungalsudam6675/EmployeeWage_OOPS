package EmpWage_OOPS;

public class CompanyEmpWage {
	public final String company;
	public final int empWagePerHr;
	public final int numOfWorkingDays;
	public final int maxNumOfHrs;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company,int empWagePerHr, int numOfWorkingDays,int maxNumOfHrs) {
		this.company=company;
		this.empWagePerHr=empWagePerHr;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxNumOfHrs=maxNumOfHrs;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	@Override
	public String  toString() {
		return "Total Empwage for company : " + company + " is : " + totalEmpWage; 
	}
}