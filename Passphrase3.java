import java.time.*;
import java.util.*;
import java.lang.*;

 public class Passphrase3{
    public static void main(String[] args){
	/*System.out.println("args.length = " + args.length);
    for(String s: args){
    	System.out.println(s);
	}*/

	trigger3(args);

    }


  public static void trigger3(String [] input){
		 LocalDateTime rightNow = LocalDateTime.now();
		 int month = rightNow.getMonth().getValue();
		// System.out.println("month equals: " + rightNow.getMonth().getValue());
		 int day = rightNow.getDayOfMonth();
		 //System.out.println("day equals: " + rightNow.getDayOfMonth());
		 int hour = rightNow.getHour();
		 //System.out.println("hour = " + rightNow.getHour());

		 /*for(String s: input){
			 System.out.println(s);
		 }*/

		 int firstArg = Integer.parseInt(input[0]);
		 int secondArg = Integer.parseInt(input[1]);
		 int thirdArg = Integer.parseInt(input[2]);

		 if(firstArg == month *2 && secondArg == day * 3 && thirdArg== hour *4){
			 System.out.println("Trigger 3 Diffused");
			 //System.out.println("Trigger 3 diffused. The bad scientist is getting nervous! Next?");
			 return;
		 }
		 else{
			 System.out.println("Wrong!");
		 }

	 }

	}
