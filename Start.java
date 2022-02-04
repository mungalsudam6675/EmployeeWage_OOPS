package EmpWage_OOPS;

import Com.OOPS.Utility.Utility;

public class Start {

	public static void main(String[] args) {
		int check=Utility.empCheck();
		if(check == 1) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}

	}

}
