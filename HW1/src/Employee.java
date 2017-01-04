
class Employee {
	String fname;
	String lname;
	double salary;
	
	Employee(String fname, String lname, double salary){
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	
	void setFname(String fname){
		this.fname = fname;
	}
	
	void setLname(String lname){
		this.lname = lname;
	}
	
	void setSalary(double salary){
		this.salary = salary;
	}
	
	String getFname(){
		return fname;
	}
	
	String getLname(){
		return lname;
	}
	
	double getSalary(){
		return salary;
	}
}