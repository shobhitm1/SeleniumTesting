package Maths;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Reverse a string
		//DIFFERENCE BETWEEN STRING AND STRINGBUFFER
		//STRING DOES NOT HAVE REVERESE FUNCTION
		
		String s= "SHOBHIT";
		
		String rev="";
		int len = s.length();
		System.out.println(len);
		for(int i=len-1;i>=0;i--) {
		rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		String s2="MAHESHWARI";int lengths = s2.length();
		StringBuffer st = new StringBuffer(s2);
		System.out.println(st.reverse());
		System.out.println(lengths);
		
	}

}
