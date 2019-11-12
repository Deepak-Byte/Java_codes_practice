
package myname;

import myname.utility.*;

public class raplceString {


	static final String TEMPLATE = "Hi username, How are YOU?";
	public static void main(String[] args) {
		String str;
		utility u=new utility();
		do {
			System.out.println("Enter the Your name");
			str=u.ReadString();
			
		}while(checkLength(str));
		
		StringReplacer(str);
		
	}
	
	public static boolean checkLength(String str) {
		
		if(str.length()<3) {
			System.out.println("Username should have atleast 3 characters..");
			return true;
		}
		return false;
		
	}
	
	public static void StringReplacer(String str) {
		System.out.println(TEMPLATE.replaceAll("username", str));
		
	}

}