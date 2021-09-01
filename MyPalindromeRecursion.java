package com.java.prac;


// without resursion
public class MyPalindromeRecursion {

	static String reverse(String s){
		if(s == null || s.isEmpty()){
	    	return s;
	    }
		
		return s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
	} 

	
static boolean IsPalindrome(String s){
    String reverseString = reverse(s) ;
    
    	if(s.equalsIgnoreCase(reverseString)){
    		return true;
    	}
    		return false;
}

    public static void main(String args[]) {
       String s = "121";
       boolean bool = IsPalindrome(s);
        System.out.println("s is boolean : " + bool);
    }
}
