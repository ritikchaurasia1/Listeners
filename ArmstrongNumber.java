package com.myFirstclass;

import java.util.Scanner;
class number{
public void findarm(int n) {
   int sum=0;
   int ans=n;
	while(n!=0) {
		int digit=n%10;
		sum=sum+digit*digit*digit;
		n=n/10;
	}
	
	if(sum==ans) {
		System.out.println("Armstrong number");
	}else {
		System.out.println(" not a armstrong number");
	}

}
}
public class ArmstrongNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number");
		int n=sc.nextInt();
		number n1=new number();
		n1.findarm(n);
		System.out.print(n);
		
			}
}
