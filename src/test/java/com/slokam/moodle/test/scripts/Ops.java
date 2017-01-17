package com.slokam.moodle.test.scripts;

public class Ops {

	
	public static void main(String[] args) {
		
		A a = new A();
		a.sleep();
		
		X x  = new A();
		x.sleep();
		
		X xx = new X(){
			public void sleep(){
				System.out.println("I am an annaomous inner class and I am sleeping.");
			}
		};
		
		xx.sleep();
	}
}
