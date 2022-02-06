package EmpWage_OOPS;

import java.util.HashMap;
import java.util.LinkedList;

import java.util.Map;

import Com.OOPS.Utility.Utility;

public class EmpWageBuilder implements IComputeEmpWage {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	

	private int company = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String, CompanyEmpWage> companyToEmpWageMap;

	public EmpWageBuilder() {
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	public void addCompanyEmpWage(String company, int empWagePerHr, int numOfWorkingDays, int maxNumOfHrs) {

		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empWagePerHr, numOfWorkingDays, maxNumOfHrs);

		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}

	public void computeEmpWage() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {

		int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;

		while (totalEmpHrs < companyEmpWage.maxNumOfHrs && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int check = Utility.empCheck();
			switch (check) {
			case IS_FULL_TIME: {
				empHrs = 8;
				break;
			}

			case IS_PART_TIME: {
				empHrs = 4;
				break;
			}

			default: {
				empHrs = 0;
			}

			}

			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + "Emp hrs: " + empHrs);

		}

		return totalEmpHrs = totalEmpHrs * companyEmpWage.empWagePerHr;

	}

	public static void main(String[] args) {

		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("DMart", 40, 8, 20);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpWage();

	}

}
