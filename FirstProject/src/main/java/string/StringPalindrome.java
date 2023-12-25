package string;

public class StringPalindrome {

	public static void main(String[] args) {
		String a="hai";
		String b="";
		for(int i=2;i>=0;i--)
		{
		b=b+a.charAt(i);
		}
		if(a.equals(b))
		{
		System.out.println("Palindrome");
		}
		else
		{
		System.out.println("Not Palindrome");
		}
		}
		}
		// TODO Auto-generated method stub
