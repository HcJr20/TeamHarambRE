import java.util.*;
import java.lang.*;

/*Trigger1 will be diffused if the characters
  'c' and 's' are entered in any order. The trigger
  won't be diffused if the exclamation mark ("!")
  or anything other than 'c' and 's'
*/

public class Passphrase1{
    public static void main(String[] args){
	    trigger1(args);
  }

public static void trigger1(String[] input){
	boolean foundC = false;
	boolean foundS = false;

	if(input[0].equals("cs")){
		System.out.println("You have proved your worthiness!!");
    System.out.println("Now what about the 2nd?");
    System.exit(1);
	}
  else{
    int i = 0;
  	while(i < input.length) {
  		if (input[i].equals("c")) {
  			foundC = true;
  		}
  		if (input[i].equals("s")) {
  			foundS = true;
  		}
      if(input[i].equals("!")){
        System.out.println(" Wrong! ");
        System.exit(1);
      }
  		i++;
  	}
  }

	if(foundC && foundS){
    System.out.println("You have proved your worthiness!!");
    System.out.println("Now what about the 2nd?");
    System.exit(1);
  }
  System.out.println("Wrong. The earth has been destroyed! Just kidding... try again and dont get discouraged!");
	System.exit(1);
	}
}
