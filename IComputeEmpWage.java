package EmpWage_OOPS;

public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int empWagePerHr, int numOfWorkingDays, int maxNumOfHrs);

	public void computeEmpWage();

	public int getTotalWage(String company);
}
