
public class Employee {
	
	String name;
	double salary;
	int workHours;
	int hireYear;

	
	Employee(String name,double salary,int workHours,int hireYear){
		
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
		
		
	}
	
	double tax() {
		
		double taxValue;
		
		if (this.salary<=1000) {
			
			taxValue = 0;
		}
		else {
			taxValue= this.salary*0.03;
		}
		return taxValue;
	}
	
	double bonus() {
		
		double extraShift;
		
		if (this.workHours > 40) {
			
			extraShift= (this.workHours - 40)*30.0;
			
		}else {
			extraShift = 0;
		}
		
		return extraShift;
	}
	
	double raiseSalary() {
		int temp = 2021 - this.hireYear;
		
		double raise = 0;
		
		if (temp <= 9 ) {
			
			
			raise = this.salary*0.05;
			
		}else if (temp > 9 && temp <= 19) {
			
			raise = this.salary*0.10;
			
		}else if (temp > 19) {
			
			
			raise = this.salary*0.15;
			
		}else {
			 raise = 0;
		}
		
		return raise;
		
	}
	
	@Override
	public String toString() {
		return "Adı : " + this.name +
				"\nMaaşı : " + this.salary + 
				"\nÇalışma Saati : " + this.workHours + 
				"\nBaşlangıç Yılı : " + this.hireYear + 
				"\nVergi : " + tax() + 
				"\nBonus : " + bonus() + 
				"\nMaaş Artışı : " + raiseSalary() + 
				"\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()) +
				"\nToplam Maaş : " + (this.salary + raiseSalary());
		
	}

}
