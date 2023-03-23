package com.techno;

public class RemoveSpecialCharacters {
	public static void main(String[]args) {
		String str = "#Wisdom^Matric*Higher%Secondary#School$.";
		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
		 System.out.println(str);  
	}

}
