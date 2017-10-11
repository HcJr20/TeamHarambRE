import java.time.*;
import java.util.*;

/*To find passphrase 3, trigger3 takes an array of three integers:
  int month, int day, int hour and compares them
  with the current month, day, and hour of day with
  the following modification:
    current month * 2
    current day * 3
    current hour * 4
  The trigger is diffused if and only if the three arguments
  meet this criteria.
    */

 public class Passphrase3{
    public static void main(String[] args){
	    trigger3(args);
    }


  public static void trigger3(String [] input){
		 LocalDateTime rightNow = LocalDateTime.now();
		 int month = rightNow.getMonth().getValue(); //current month
		 int day = rightNow.getDayOfMonth(); //current day
		 int hour = rightNow.getHour();//current hour

		 int firstArg = Integer.parseInt(input[0]); //month input by user
		 int secondArg = Integer.parseInt(input[1]); //day input by user
		 int thirdArg = Integer.parseInt(input[2]); //hour input by user

		 if(firstArg == month *2 && secondArg == day * 3 && thirdArg== hour *4){
			 System.out.println("Trigger 3 diffused. The bad scientist is getting nervous! Next?");
			 return;
		 }
		 else{
			 System.out.println("Wrong. The earth has been destroyed! Just kidding... try again and dont get discouraged!");
		 }

	 }

	}
