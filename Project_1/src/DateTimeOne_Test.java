import java.io.IOException;
public class DateTimeOne_Test {

	public static void main(String[] args) 
	{
		
		int stopIfSecond = 30;
		DateTimeOne dateTimeOne = new DateTimeOne();
	    dateTimeOne.dateTimeNow();	
		/**
		 * You have to retrieve the value of "Second" of the current time.
		 * If 'Second' is greater than 30, you have to sleep your program for 3 seconds. 
		 * Current value of â€œSecondâ€� is stored in vlaueOfSecondNow. 
		 * If second is 58, the resulted string will be, "The value of Second now: 58"
		 */
		int vlaueOfSecondNow = dateTimeOne.getValueOfSecond();
		System.out.println(vlaueOfSecondNow);
		/**
		 * If vlaueOfSecondNow>30, program will sleep for 3 seconds.
		 */		
		//if(vlaueOfSecondNow > stopIfSecond)
		//{
			dateTimeOne.sleepForThreeSec();
		//}
	    //dateTimeOne.dateTimeNow();	
		
	    System.out.println("test");
	}
}