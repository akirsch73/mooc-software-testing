package alex.romanNumbers;

public class LeapYear {
	
	public boolean leapYearBy4Not100 (int year) {
		boolean leapyear = false;
		if(year%4==0&&!(year%100==0)) {
			leapyear = true;
			System.out.println("Das Jahr " + year + " ist ein Schaltjahr.");
		} 
		else if (year%400==0) {
			leapyear = true;
			System.out.println("Das Jahr " + year + " ist ein Schaltjahr.");
		}
		else {
			System.out.println("Das Jahr " + year + " ist KEIN Schaltjahr.");
		}
		return leapyear;
	}
}
