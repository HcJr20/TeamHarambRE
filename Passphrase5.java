package passcode5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class passcode5 {

	public static void main(String args[]) throws FileNotFoundException {
		
		File f = new File("file.txt");
		Scanner sc = new Scanner(f);
		if (f.exists() ) { // if file exist's
			
			char var;
			int i = 0;
			boolean mistake = false; 
			if(!sc.hasNext())
				mistake = true;
			while(sc.hasNext() && mistake == false){
				var = sc.next().charAt(i);
				if(hasMistake(var,i)){
					mistake = true;
					continue;
				}
				i++;
			}
			if(mistake)
				System.out.println("Sorry the earth has been destroyed... Just kidding, dont give up!");
			else{
				System.out.println("Trigger 5 defused. Last one dont give up! What is it?");
			}
		}else{
			System.out.println("Sorry the earth has been destroyed... Just kidding, dont give up!");
		}
		sc.close();
	}
	
	static boolean hasMistake(char var, int pos){
		boolean ret = true;
		
		if(var == 'g' && pos == 0)
			ret = false;
		else if(var == 'o' && pos == 3 || pos == 8 || pos == 41)
			ret = false;
		else if(var == 'd' && pos == 17)
			ret = false;
		else if(var == 'j' && pos == 28)
			ret = false;
		else if(var == 'b' && pos == 56)
			ret = false;
		else if(var == ' ' && pos != 3 || pos != 8 || pos != 41 || pos != 17 || pos != 28 || pos != 56)
			ret = false;
		
		return ret;
	}
}
