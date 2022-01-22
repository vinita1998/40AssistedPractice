package com.accessModifiers;

public class PrivateAccessSpecifier2 {
	public static void main(String[] args) {
		//private
		System.out.println("Private Access Specifier");
		PrivateAccessSpecifier1 obj = new PrivateAccessSpecifier1(); 
        //trying to access private method of another class 
        //obj.display();

	}


}
