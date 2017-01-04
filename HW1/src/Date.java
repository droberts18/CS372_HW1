
class Date {
	int month;
	int day;
	int year;
	
	Date(int month, int day, int year){
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	void displayDate(){
		System.out.printf("Date: %d/%d/%d", month, day, year);
	}
	
	void setMonth(int month){
		this.month = month;
	}
	
	void setDay(int day){
		this.day = day;
	}
	
	void setYear(int year){
		this.year = year;
	}
	
	int getMonth(){
		return month;
	}
	
	int getDay(){
		return day;
	}
	
	int getYear(){
		return year;
	}
}
