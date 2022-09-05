// Palindrome String
public class palindrome 
{
	public static void main(String[] args) 
	{
		String str="techno india university";
		String rev="";
		
		for (int i=str.length()-1; i >= 0; i-- )
	         rev = rev + str.charAt(i);

if (str.equals(rev))
	         System.out.println(str+" is palindrome");
	      else
	         System.out.println(str+" is not palindrome");
	}
}
/*
Output:
techno india university is -


Armstrong number
 
 Evaluate sum of n natural numbers
yeh toh khudse karle besharam
*/