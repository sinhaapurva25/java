// Vowels, consonants, words
import java.util.Scanner;

public class frq
{
	public static void main(String[] args) 
	{
		String str;
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Enter a string:");
	    str = sc.nextLine();
	    int vowels=0, words=1;
	    char[] c=str.toCharArray();
	    
	    for(int i=0;i<str.length();i++)
	    {
	    	switch(c[i])
	    	{
	    	case 'a':
	    	case 'e':
	    	case 'i':
	    	case 'o':
	    	case 'u':
	    	case 'A':
	    	case 'E':
	    	case 'I':
	    	case 'O':
	    	case 'U':
	    		vowels++;
	    		continue;
	    	case ' ':
	    		words++;
	    		continue;
	    	}
	    }
	    System.out.println("No. of vowels= "+vowels);
	    System.out.println("No. of words= "+words);
	    System.out.println("No. of consonants= "+(str.length()-vowels-words+1));

		sc.close();
	}
}
/*
Output:
Enter a string:
Q W E R T Y U I O P A S D F G H J K L Z X C V B N M
No. of vowels= 5
No. of words= 26
No. of consonants= 21

Catch multiple exception using try catch
 
 

Evaluate area of triangle, rectangle, circle
 
 
 
User defined exception
*/