package branching;

import logDemo.Log4jDemo;

public class Break_Continue_Example extends Log4jDemo {
	/*
	 * We can use Java break statement in all types of loops such as for loop, while
	 * loop and do-while loop.
	 */
	public void BreakExample() {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// breaking the loop
				break;
			}
			System.out.println(i);
		}
	}

	public void BreakWhileExample() {
		// while loop
		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				// using break statement
				i++;
				break;// it will break the loop
			}
			System.out.println(i);
			i++;
		}
	}

	public void BreakDoWhileExample() {
		// declaring variable
		int i = 1;
		// do-while loop
		do {
			if (i == 5) {
				// using break statement
				i++;
				break;// it will break the loop
			}
			//Log4jDemo.printInfo(Break_Continue_Example.class, "We are printing log");
			i++;
		} while (i <= 10);
	}
	
	public void ContinueExample() {
		 for(int i=1;i<=10;i++){  
		        if(i==5){  
		            //using continue statement 
		            continue;//it will skip the statement 
		        }  
		     
		        
		    } 
		// Log4jDemo.printInfo(Break_Continue_Example.class, "We are printing log");
		 //Log4jDemo.printError(Break_Continue_Example.class, "Error here");
		 }
	public static void main(String[] args) {
		Break_Continue_Example example=new Break_Continue_Example();
		//example.BreakExample();
		//example.BreakWhileExample();
		//example.BreakDoWhileExample();
		//Log4jDemo.
		example.ContinueExample();
	}
}
