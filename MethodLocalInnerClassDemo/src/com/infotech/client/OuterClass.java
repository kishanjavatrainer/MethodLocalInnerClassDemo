package com.infotech.client;

public class OuterClass {

	private int outerData = 1000;

	public void display() {
		 int finalData = 5000; 
		  class InnerClass {
			private int innerData = 3000;
			public void invoke() {
				System.out.println("InnerClass:invoke method is Called:" + outerData);
				System.out.println("InnerClass:invoke method is Called:" + innerData);
				System.out.println("InnerClass:invoke method is Called:" + finalData);
			}
		}
		new InnerClass().invoke();
	}
}
