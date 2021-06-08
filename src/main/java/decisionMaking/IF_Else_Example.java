package decisionMaking;

public class IF_Else_Example {
	int i = 10;
	/*
	  The Java if statement is used to test the condition. It checks boolean
	  condition: true or false. There are various types of if statement in Java.
	 */
	
	//IfExample
	public void IfExample() {
		if (i <= 15) {
			System.out.println("10 is less than 15");
		}
		System.out.println("I am Not in if");
	}

	
	//IfElseExample
	public void IfElseExample() {
		if (i >= 15) {
			System.out.println("In if part");
		} else {
			System.out.println("in else part");
		}
	}

	
	
	//IfElseTernaryExample
	public void IfElseTernaryExample() {
		// Using ternary operator
		String output = (i % 2 == 0) ? "even number" : "odd number";
		System.out.println(output);
	}

	
	
	//if-else-if ladder Statement
	public void IfElseIfExample() {
		int marks = 65;

		if (marks < 50) {
			System.out.println("fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A grade");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("Invalid!");
		}
	}
	
	
	//JavaNestedIfExample 
	
	public void JavaNestedIfExample() {
	    int age=20;  
	    int weight=80;    
	    //applying condition on age and weight  
	    if(age>=18){    
	        if(weight>50){  
	            System.out.println("You are eligible to donate blood");  
	        }    
	    }    
	}
	
	public static void main(String[] args) {
		IF_Else_Example else_Example =new IF_Else_Example();
		//else_Example.IfExample();
		//else_Example.IfElseExample();
		//else_Example.IfElseTernaryExample();
		//else_Example.IfElseIfExample();
		//else_Example.JavaNestedIfExample();
	}
}
