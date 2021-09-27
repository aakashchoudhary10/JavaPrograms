package javaprogram;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
        isAnagram("Mother In Law", "Hitler Woman");
        
        isAnagram("keEp", "peeK");
 
        isAnagram("SiLeNt CAT", "LisTen AcT");
 
        isAnagram("Debit Card", "Bad Credit");
 
        isAnagram("School MASTER", "The ClassROOM");
 
        isAnagram("DORMITORY", "Dirty Room");
 
        isAnagram("ASTRONOMERS", "NO MORE STARS");
 
        isAnagram("Toss", "Shot");
 
        isAnagram("joy", "enjoy");

	}

	static void isAnagram(String s1, String s2) {
		
		boolean status = true;
		
		String copyofString1 = s1.replaceAll("\\s","").toLowerCase();
		String copyofString2 = s2.replaceAll("\\s","").toLowerCase();
		
		if(copyofString1.length()!=copyofString2.length()) {
			status = false;
		}
		else 
		{
		char [] s1Array = copyofString1.toCharArray();
		char [] s2Array = copyofString2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		status = Arrays.equals(s1Array,s2Array);
		}
		
		
		if(status) 
		{
			System.out.println(s1+" and "+s2+" are Angrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not Angrams");
		}
	}

}
