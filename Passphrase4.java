/*To find passphrase 4, trigger4 takes an array
and checks its contents. There are several possible
array combinations that will difusse the trigger:
    8 x 20 a
    8 x 30 c
    11 *any char but x* 5 r
    21 *any char* 21 r
    */
public class Passphrase4{

    public static void main(String[]args){
      trigger4(args);
    }

  public static void trigger4(String[]input){
  	boolean ret = false;
  	int num1 = Integer.parseInt(input[0]);
  	String str1 = input[1];
    char char1 = str1.charAt(0);
  	int num2 = Integer.parseInt(input[2]);
    String str2 = input[3];
  	char char2 = str2.charAt(0);


  	if(num1 == 8 && char1 =='x' && num2 == 20 && char2 == 'a')
  	    ret = true;
  	if(num1 == 8 && char1 =='x' && num2 == 30 && char2 == 'c')
  	    ret = true;
  	if(num1 == 11 && char1 !='x' && num2 == 5 && char2 == 'r')
  	    ret = true;
  	if(num1 == 21 && num2 == 21 && char2 == 'r')
  	    ret = true;
  	if(ret)
  	    System.out.println("Trigger 4 Diffused. You are doing great! What is passphrase 5?");
  	else{
  	    System.out.println("Wrong. The earth has been destroyed! Just kidding... try again and dont get discouraged!");
  	    System.exit(1);
  	}
  }


}
