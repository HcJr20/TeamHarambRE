import java.util.*;
import java.lang.*;

public class Passphrase1{
    public static void main(String[] args){
	System.out.println("args.length = " + args.length);
    for(String s: args)
    	System.out.println(s);
	trigger1(args);

  }

public static void trigger1(String[] input){
	boolean foundC = false;
	boolean foundS = false;

	if(input[0].equals("cs")){
		System.out.println("Trigger 1 diffused");
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
    System.out.println("Trigger 1 diffused");
    System.exit(1);
  }
  System.out.println(" Wrong! ");
	System.exit(1);
	}
}
