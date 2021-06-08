package looping;

public class While_DoWhile_Example {
	/*
	 * The Java while loop is used to iterate a part of the program several times.
	 * If the number of iteration is not fixed, it is recommended to use while loop.
	 */

	public void WhileExample() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}
	
	
	/*
	  The Java do-while loop is used to iterate a part of the program several
	  times. If the number of iteration is not fixed and you must have to execute
	  the loop at least once, it is recommended to use do-while loop.
	  
	  The Java do-while loop is executed at least once because condition is checked
	  after loop body.
	 */
	public void DoWhileExample() {
	 int i=1;  
	    do{  
	        System.out.println(i);  
	    i++;  
	    }while(i<=10);  
	}  
	
	public static void main(String[] args) {
		While_DoWhile_Example example=new While_DoWhile_Example();
		example.WhileExample();
		example.DoWhileExample();
	}
}
