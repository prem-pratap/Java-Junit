package junit.first;

public class stringPallindrome {
	public boolean pallindromeCheck(String str) {
		boolean res=false;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
			rev=rev+str.charAt(i);
		if(str.equalsIgnoreCase(rev))
			res=true;
		else 
			res=false;
		return res;
		
	}
}
