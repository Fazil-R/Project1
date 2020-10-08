import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOne
{
	public void dateTimeNow() 
	{
		//Date/time object for date/time
		DateTimeFormatter formattedDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a");
		LocalDateTime showDateTime = LocalDateTime.now();
		String formattedDateTimeFinal = showDateTime.format(formattedDateTime);
	    System.out.println("Current Date/Time: " + formattedDateTimeFinal);	    
	}
	
	public  int getValueOfSecond() //return value of second
	{
		LocalDateTime time = LocalDateTime.now();
		return time.getSecond();	
	}
	
	public void sleepForThreeSec()  { //makes program sleep for 3 seconds
		try {
				Thread.sleep(3000);
		}
		
		catch (InterruptedException e) {
			System.out.println("interrupt");
		}
	}
	
}