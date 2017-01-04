public class DateTest {
	public static void main(String[] args){
		// Date Test
		Date d = new Date(4, 29, 2014);
		
		d.setMonth(1);
		d.setDay(3);
		d.setYear(2017);
		
		// Outputting correct date
		d.displayDate();
	}
}