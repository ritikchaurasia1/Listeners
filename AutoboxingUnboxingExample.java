package com.myFirstclass;
import java.util.*;
public class AutoboxingUnboxingExample {
	public static void main(String args[]) {
	int primitiveInt = 5;
    Integer wrapperInt = primitiveInt; 
    System.out.println("Autoboxing: " + wrapperInt); 
    
    double primitiveDouble = 3.14;
    Double wrapperDouble = primitiveDouble;  
    System.out.println("Autoboxing: " + wrapperDouble); 
    
    
    Integer anotherWrapperInt = 10;
    int unboxedInt = anotherWrapperInt; 
    System.out.println("Unboxing: " + unboxedInt); 
    
    Double anotherWrapperDouble = 5.67;
    double unboxedDouble = anotherWrapperDouble; 
    System.out.println("Unboxing: " + unboxedDouble);  
    ArrayList<Integer> list = new ArrayList<>();
    list.add(100);
    System.out.println("ArrayList with Autoboxing: " + list);
       


	}



}
