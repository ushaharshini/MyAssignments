
package Challenges;

import java.util.Arrays;
import java.util.List;

public class FindLengthOfTheLastWord1 {
	
public void findTheLength(String s) {
		
		String[] spiltArray=s.split(" ");
		
		System.out.println(Arrays.toString(spiltArray));
		
		List<String>listString = Arrays.asList(spiltArray);
		
		String string=listString.get(listString.size()-1);
		
		int length =string.length();
		
		System.out.println("The length of the last word " + s +" is---->" +length);
		
		}

	public static void main(String[] args) {
	
		FindLengthOfTheLastWord1 word = new FindLengthOfTheLastWord1();
		
		word.findTheLength("Hello World");
		word.findTheLength("fly me to the moon");
		word.findTheLength("luffy is still joyboy");
	}

}
