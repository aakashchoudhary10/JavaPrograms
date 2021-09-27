package javaprogram;

import java.util.Scanner;

public class RemoveWhiteSpaces 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter input string to be cleaned from white spaces...!");
         
        String inputString = sc.nextLine();
        
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        
        System.out.println("Input String : "+inputString);
        
        System.out.println("Input String Without Spaces using In-built method replaceAll: "+stringWithoutSpaces);
        
        char[] charArray = inputString.toCharArray();
         
        String stringWithoutSpaces2 = "";
         
        for (int i = 0; i < charArray.length; i++) 
        {
            if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
            {
                stringWithoutSpaces2 = stringWithoutSpaces2 + charArray[i];
            }
        }
         
        System.out.println("Input String Without Spaces using logic: "+stringWithoutSpaces2);
         
        sc.close();
    }
}
