package com.myFirstclass;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int ans=n;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(ans%i==0)
				sum+=i;
		}
		if(sum==ans) {
			System.out.println("perfect number");
		}else {
			System.out.println("not a perfect number");
		}
	}

}
