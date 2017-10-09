import java.time.*;
import java.util.*;
import java.lang.*;

 public class Trigger{
    public static void main(String[] args){
	trigger1(args[0]);
	trigger4();
	/*tigger2();
	trigger3();
	tigger4();
        trigger5(); */
    }
    
    public static void trigger1(String input){
	boolean foundC = false;
	boolean foundS = false; 
	
	int i = 0;
	while(i < input.length()){
	    if(input.charAt(i) == 'c')
		foundC = true;
	    
	    else if(input.charAt(i) == 's')
		foundS = true;
	    else{
		foundC = false;
		foundS = false;
	    }
	    i++;
	}
	
	if(foundC && foundS)
	    System.out.println("Trigger 1 diffused");
	else{
	    System.out.println(" Wrong! "); 
	    System.exit(1);
	}
    }
 
   public static void trigger2(){
       int[] input = new int[6];
       Scanner sc = input.nextInt();
       try{
	   int i = 0;
	   while(i < 6){
	       input[i] = sc.nextInt();
	        if(input[i] == 32){
		       break;
		}
	   
		i++;
	      }
	   int offset = input[0];
	   int index = offset;
	   int offsetTracker = 0;
	   checkInputs(input, 6);
       }
       catch(ArrayIndexOutOfBoundsException e){
	   System.exit(1);
	   }
     }
     
     public static void checkInput(int[] input, int limit){
	 int iterator = 2;
	 int offset = input[0];
   
       
	 while(iterator < limit){
	     
	 }
     }
     public static int getOffsetIndex(){
	 int i = 0;
	 while(1){
             while()
		 }
     }
   public static void trigger4(){
	Scanner sc = new Scanner(System.in);
	boolean ret = false;
	int num1;
	char char1;
	int num2;
	char char2;
	 
	System.out.println("Trigger 3 diffused. The bad scientist is getting nervous! Next?");
	 
	num1 = sc.nextInt();
	sc.next();
	char1 = ;
	sc.next();
	num2 = sc.nextInt();
	char2 = (char) System.in.read(); 
	 
	if(num1 == 8 && char1 =='x' && num2 == 20 && char2 == 'a')
	    ret = true;
	if(num1 == 8 && char1 =='x' && num2 == 30 && char2 == 'c')
	    ret = true;
	if(num1 == 11 && char1 !='x' && num2 == 5 && char2 == 'r')
	    ret = true;
	if(num1 == 21 && num2 == 21 && char2 == 'r')
	    ret = true;
	if(ret)
	    System.out.println("Trigger 4 Defused. You are doing great! What is passphrase 5?");
	else{
	    System.out.println("Wrong. The earth has been destroyed! Just kidding... try again and dont get discouraged!");
	    System.exit(1);
	}
	} 
}